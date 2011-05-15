/*******************************************************************************
* Copyright (c) 2006 Eclipse.org
* 
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*******************************************************************************/
package org.eclipse.gmf.internal.xpand.expression.parser;

public interface ExpressionLexersym {
    public final static int
      Char_CtlCharNotWS = 100,
      Char_LF = 97,
      Char_CR = 98,
      Char_HT = 88,
      Char_FF = 89,
      Char_a = 13,
      Char_b = 11,
      Char_c = 14,
      Char_d = 15,
      Char_e = 16,
      Char_f = 12,
      Char_g = 28,
      Char_h = 29,
      Char_i = 30,
      Char_j = 31,
      Char_k = 32,
      Char_l = 33,
      Char_m = 34,
      Char_n = 23,
      Char_o = 35,
      Char_p = 36,
      Char_q = 37,
      Char_r = 24,
      Char_s = 38,
      Char_t = 25,
      Char_u = 26,
      Char_v = 39,
      Char_w = 40,
      Char_x = 41,
      Char_y = 42,
      Char_z = 43,
      Char__ = 44,
      Char_A = 17,
      Char_B = 18,
      Char_C = 19,
      Char_D = 20,
      Char_E = 21,
      Char_F = 22,
      Char_G = 45,
      Char_H = 46,
      Char_I = 47,
      Char_J = 48,
      Char_K = 49,
      Char_L = 50,
      Char_M = 51,
      Char_N = 52,
      Char_O = 53,
      Char_P = 54,
      Char_Q = 55,
      Char_R = 56,
      Char_S = 57,
      Char_T = 58,
      Char_U = 59,
      Char_V = 60,
      Char_W = 61,
      Char_X = 62,
      Char_Y = 63,
      Char_Z = 64,
      Char_0 = 1,
      Char_1 = 2,
      Char_2 = 3,
      Char_3 = 4,
      Char_4 = 5,
      Char_5 = 6,
      Char_6 = 7,
      Char_7 = 8,
      Char_8 = 9,
      Char_9 = 10,
      Char_Space = 65,
      Char_DoubleQuote = 66,
      Char_SingleQuote = 67,
      Char_Percent = 90,
      Char_VerticalBar = 68,
      Char_Exclamation = 75,
      Char_AtSign = 91,
      Char_BackQuote = 92,
      Char_Acute = 101,
      Char_Tilde = 93,
      Char_Sharp = 94,
      Char_DollarSign = 102,
      Char_Ampersand = 69,
      Char_Caret = 95,
      Char_Colon = 70,
      Char_SemiColon = 96,
      Char_BackSlash = 76,
      Char_LeftBrace = 77,
      Char_RightBrace = 78,
      Char_LeftBracket = 79,
      Char_RightBracket = 80,
      Char_QuestionMark = 81,
      Char_Comma = 82,
      Char_Dot = 71,
      Char_LessThan = 83,
      Char_GreaterThan = 72,
      Char_Plus = 84,
      Char_Minus = 85,
      Char_Slash = 73,
      Char_Star = 74,
      Char_LeftParen = 86,
      Char_RightParen = 87,
      Char_Equal = 27,
      Char_AfterASCII = 103,
      Char_EOF = 99;

      public final static String orderedTerminalSymbols[] = {
                 "",
                 "0",
                 "1",
                 "2",
                 "3",
                 "4",
                 "5",
                 "6",
                 "7",
                 "8",
                 "9",
                 "b",
                 "f",
                 "a",
                 "c",
                 "d",
                 "e",
                 "A",
                 "B",
                 "C",
                 "D",
                 "E",
                 "F",
                 "n",
                 "r",
                 "t",
                 "u",
                 "Equal",
                 "g",
                 "h",
                 "i",
                 "j",
                 "k",
                 "l",
                 "m",
                 "o",
                 "p",
                 "q",
                 "s",
                 "v",
                 "w",
                 "x",
                 "y",
                 "z",
                 "_",
                 "G",
                 "H",
                 "I",
                 "J",
                 "K",
                 "L",
                 "M",
                 "N",
                 "O",
                 "P",
                 "Q",
                 "R",
                 "S",
                 "T",
                 "U",
                 "V",
                 "W",
                 "X",
                 "Y",
                 "Z",
                 "Space",
                 "DoubleQuote",
                 "SingleQuote",
                 "VerticalBar",
                 "Ampersand",
                 "Colon",
                 "Dot",
                 "GreaterThan",
                 "Slash",
                 "Star",
                 "Exclamation",
                 "BackSlash",
                 "LeftBrace",
                 "RightBrace",
                 "LeftBracket",
                 "RightBracket",
                 "QuestionMark",
                 "Comma",
                 "LessThan",
                 "Plus",
                 "Minus",
                 "LeftParen",
                 "RightParen",
                 "HT",
                 "FF",
                 "Percent",
                 "AtSign",
                 "BackQuote",
                 "Tilde",
                 "Sharp",
                 "Caret",
                 "SemiColon",
                 "LF",
                 "CR",
                 "EOF",
                 "CtlCharNotWS",
                 "Acute",
                 "DollarSign",
                 "AfterASCII"
             };

    public final static boolean isValidForParser = true;
}