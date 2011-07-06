$Globals
	/.import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.gmf.internal.xpand.util.ParserException.ErrorLocationInfo;
./
$End

$Headers
	/.
		public ErrorLocationInfo[] getErrors() {
			return errors.toArray(new ErrorLocationInfo[errors.size()]);
		}

		private void resetErrors() {
			errors.clear();
		}

		private final List<ErrorLocationInfo> errors = new LinkedList<ErrorLocationInfo>();

		@Override
		public void reportError(int errorCode, String locationInfo, int leftToken, int rightToken, String tokenText) {
			final int leftTokenLine = getLine(leftToken);
			final int leftTokenColumn = getColumn(leftToken);
			final int rightTokenLine = getEndLine(rightToken);
			final int rightTokenColumn = getEndColumn(rightToken);
			final String msg = tokenText + errorMsgText[errorCode];
			errors.add(new ErrorLocationInfo(msg, leftTokenLine, leftTokenColumn, rightTokenLine, rightTokenColumn));
		}
/*
		@Override
		public void reportError(int leftToken, int rightToken) {
			int errorCode = (rightToken >= getStreamLength() ? EOF_CODE : leftToken == rightToken ? LEX_ERROR_CODE : INVALID_TOKEN_CODE);
			int endToken = (leftToken == rightToken ? rightToken : rightToken - 1);
			String msg = (errorCode == EOF_CODE ? "End-of-file " : errorCode == INVALID_TOKEN_CODE
						? "\"" + new String(getInputChars(), leftToken, rightToken - leftToken) + "\" "
						: "\"" + getCharValue(leftToken) + "\" ");

			final int leftTokenLine = getLine(leftToken);
			final int leftTokenColumn = getColumn(leftToken);
			final int rightTokenLine = getEndLine(endToken);
			final int rightTokenColumn = getEndColumn(endToken);
			errors.add(new ErrorLocationInfo(msg, leftTokenLine, leftTokenColumn, rightTokenLine, rightTokenColumn));
		}
*/
		@Override
		public void reportError(int errorCode, String locationInfo, String tokenText) {
			try {
				Matcher m = Pattern.compile("(?:[^:]+::)*[^:]+:(\\d+):(\\d+):(\\d+):(\\d+):.*").matcher(locationInfo);
				boolean t = m.matches(); // ignore return value, rely on exception if anything wrong
				assert t;
				final int leftTokenLine = getLine(Integer.parseInt(m.group(1)));
				final int leftTokenColumn = getColumn(Integer.parseInt(m.group(2)));
				final int rightTokenLine = getEndLine(Integer.parseInt(m.group(3)));
				final int rightTokenColumn = getEndColumn(Integer.parseInt(m.group(4)));
				final String msg = tokenText + errorMsgText[errorCode];
				errors.add(new ErrorLocationInfo(msg, leftTokenLine, leftTokenColumn, rightTokenLine, rightTokenColumn));
			} catch (Throwable ex) {
				// ignore
				errors.add(new ErrorLocationInfo(tokenText + errorMsgText[errorCode]));
			}
		}
	./
$End