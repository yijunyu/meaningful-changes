--------------------------------------------------------------------------------
-- Entity: fifo
--------------------------------------------------------------------------------
-- Copyright ... 2010
-- Filename          : fifo.vhd
-- Creation date     : 2010-04-02
-- Author(s)         : spandiko
-- Version           : 1.00
-- Description       : <short description>
--------------------------------------------------------------------------------
-- File History:
-- Date         Version  Author   Comment
-- 2010-04-02   1.00     spandiko     Creation of File
--------------------------------------------------------------------------------
library ieee;
use ieee.std_logic_1164.all;
use ieee.std_logic_unsigned.all;

package fifoPCK is

	component fifo
	port  (
		clk : in std_logic
	);
	end component;

end package;


--------------------------------------------------------------------------------


library ieee;
use ieee.std_logic_1164.all;
use ieee.std_logic_unsigned.all;

entity fifo is
	port  (
		clk : in std_logic        -- input clock, xx MHz.
	);
end fifo;

architecture arch of fifo is

begin



end arch;

