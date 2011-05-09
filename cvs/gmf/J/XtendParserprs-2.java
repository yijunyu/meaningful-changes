/*******************************************************************************
 * Copyright (c) 2006 Eclipse.org
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.gmf.internal.xpand.xtend.parser;

public class XtendParserprs implements lpg.lpgjavaruntime.ParseTable, XtendParsersym {

    public interface IsKeyword {
        public final static byte isKeyword[] = {0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0
        };
    };
    public final static byte isKeyword[] = IsKeyword.isKeyword;
    public final boolean isKeyword(int index) { return isKeyword[index] != 0; }

    public interface BaseCheck {
        public final static byte baseCheck[] = {0,
            1,6,1,4,1,1,3,1,5,10,
            1,0,5,1,3,1,3,1,3,1,
            3,1,1,1,1,1,1,1,3,1,
            1,1,3,1,1,1,2,2,2,3,
            1,2,1,1,1,1,1,1,1,1,
            3,4,3,1,1,3,2,2,1,1,
            1,1,1,4,6,4,1,1,1,1,
            1,1,0,1,2,4,1,3,1,1,
            4,1,1,1,3,1,1,3,3,0,
            2,3,0,2,3,4,0,2,1,1,
            14,11,10,11,0,1,0,1,0,1,
            0,1,2,0,3,3,3,3,0,1,
            1,3,1,-53,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,-2,0,-74,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,-4,0,-92,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,-9,0,-36,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,-38,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,-48,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,-69,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,-72,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,-81,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,-103,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,-95,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,-110,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,-82,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,-65,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,-102,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,-66,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,-112,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            -115,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,-116,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,-80,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,-67,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,-68,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,-79,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,-78,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,-46,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,-47,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,-87,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,-77,0,0,0,0,0,0,0,
            0,-28,0,0,0,0,0,-29,0,0,
            0,0,0,-16,0,0,0,0,0,-37,
            0,0,0,0,0,-6,-8,0,0,0,
            0,0,-10,0,-20,0,0,0,-11,0,
            -84,-1,-3,0,-15,0,0,0,0,0,
            -5,0,-73,0,0,0,0,0,-7,-52,
            0,0,-107,-21,0,0,-40,0,0,0,
            0,0,-41,0,0,0,0,0,0,-45,
            0,0,-54,0,-18,0,0,0,0,0,
            0,-19,0,0,-55,0,0,-56,-93,0,
            -64,-98,-99,-109,-100,0,-101,-118,0,-12,
            -13,-14,-17,-22,-23,-24,-25,0,0,-26,
            0,-27,-30,-31,-32,-33,-34,-35,0,-39,
            0,0,0,0,0,-42,0,0,-43,-44,
            -49,0,-50,-51,0,0,-57,-58,-59,-60,
            -61,-62,-63,-70,-71,-75,-76,-83,-85,-86,
            -88,-89,-90,-91,-94,-96,-97,-104,-105,-106,
            -108,-111,-113,-114,-117,0
        };
    };
    public final static byte baseCheck[] = BaseCheck.baseCheck;
    public final int baseCheck(int index) { return baseCheck[index]; }
    public final static byte rhs[] = baseCheck;
    public final int rhs(int index) { return rhs[index]; };

    public interface BaseAction {
        public final static char baseAction[] = {
            47,28,29,29,27,27,25,25,26,26,
            24,24,34,34,23,23,21,21,22,22,
            20,20,48,48,48,48,48,48,19,19,
            49,49,17,17,50,50,18,18,18,35,
            35,9,9,10,10,10,10,10,10,10,
            10,10,6,6,6,6,15,15,16,11,
            11,14,12,13,7,7,7,8,8,8,
            8,8,8,36,36,32,32,31,31,3,
            3,4,5,5,5,2,2,1,1,47,
            37,37,40,38,38,41,41,39,39,42,
            42,43,43,43,44,45,45,51,51,52,
            52,55,55,33,30,30,30,30,30,53,
            53,46,46,54,29,86,80,54,79,932,
            50,55,961,36,903,44,45,46,47,48,
            49,900,915,918,960,959,967,11,956,5,
            969,3,977,1,27,976,62,86,80,54,
            79,932,50,55,961,36,903,44,45,46,
            47,48,49,900,915,918,960,959,967,11,
            956,5,969,3,977,1,327,984,90,86,
            80,54,79,932,50,55,961,36,903,44,
            45,46,47,48,49,900,915,918,960,959,
            967,11,956,5,969,3,977,1,333,78,
            1,86,80,54,79,932,50,55,961,36,
            903,44,45,46,47,48,49,900,915,918,
            960,959,967,11,956,5,969,3,950,1,
            90,86,80,54,79,932,50,55,961,36,
            903,44,45,46,47,48,49,900,915,918,
            960,959,967,11,956,5,969,3,971,1,
            90,86,80,975,79,932,50,55,961,36,
            903,44,45,46,47,48,49,900,915,918,
            960,959,967,11,956,5,969,3,974,1,
            90,86,80,54,79,932,50,55,961,36,
            903,44,45,46,47,48,49,900,915,918,
            960,959,967,11,956,5,969,3,974,1,
            118,86,80,54,79,932,50,55,961,36,
            903,44,45,46,47,48,49,900,915,918,
            960,959,967,11,956,5,969,3,981,1,
            90,86,80,54,79,932,50,55,961,36,
            903,44,45,46,47,48,49,900,915,918,
            960,959,967,11,956,5,969,3,985,1,
            90,86,80,54,79,932,50,55,961,36,
            903,44,45,46,47,48,49,900,915,918,
            960,959,967,11,956,5,969,3,991,1,
            171,86,80,54,79,932,50,55,961,36,
            903,44,45,46,47,48,49,900,915,918,
            960,959,967,11,956,5,969,989,171,86,
            80,54,79,932,50,55,961,36,903,44,
            45,46,47,48,49,900,915,918,960,959,
            967,11,956,5,969,2,146,86,80,54,
            79,932,50,55,961,36,903,44,45,46,
            47,48,49,900,915,918,960,959,967,11,
            956,7,969,146,86,80,54,79,932,50,
            55,961,36,903,44,45,46,47,48,49,
            900,915,918,960,959,967,11,980,146,86,
            80,54,79,932,50,55,961,36,903,44,
            45,46,47,48,49,900,915,918,960,959,
            967,11,9,196,86,80,54,79,932,50,
            55,961,36,903,44,45,46,47,48,49,
            900,915,918,960,959,967,15,196,86,80,
            54,79,932,50,55,961,36,903,44,45,
            46,47,48,49,900,915,918,960,959,967,
            994,196,86,80,54,79,932,50,55,961,
            36,903,44,45,46,47,48,49,900,915,
            918,960,959,967,995,196,86,80,54,79,
            932,50,55,961,36,903,44,45,46,47,
            48,49,900,915,918,960,959,967,928,196,
            86,80,54,79,932,50,55,961,36,903,
            44,45,46,47,48,49,900,915,918,960,
            17,967,196,86,80,54,79,932,50,55,
            961,36,903,44,45,46,47,48,49,900,
            915,918,19,196,86,80,54,79,932,50,
            55,961,36,903,44,45,46,47,48,49,
            900,915,29,196,86,80,54,79,932,50,
            55,961,36,903,44,45,46,47,48,49,
            900,915,21,196,86,80,54,79,932,50,
            55,961,36,903,44,45,46,47,48,49,
            33,915,220,86,80,54,79,932,50,55,
            961,38,903,44,45,46,47,48,49,220,
            86,80,54,79,932,50,55,961,37,903,
            44,45,46,47,48,49,220,86,80,54,
            79,932,50,55,961,4,903,44,45,46,
            47,48,49,266,86,80,54,79,932,919,
            55,961,304,86,80,944,79,932,304,86,
            80,944,79,932,298,86,80,110,79,932,
            281,86,80,944,79,932,268,281,86,80,
            930,79,932,268,74,87,86,936,943,272,
            74,391,133,235,945,281,86,80,884,79,
            932,133,76,281,86,80,983,79,932,235,
            87,86,58,361,115,89,934,356,853,99,
            100,859,98,361,987,853,99,100,859,863,
            283,846,871,366,879,54,88,120,91,154,
            834,871,54,85,986,288,987,94,249,399,
            879,386,386,386,421,386,973,386,421,122,
            287,325,291,335,143,16,336,340,42,937,
            347,972,350,211,354,258,337,26,343,703,
            346,113,118,117,40,116,351,115,992,359,
            364,365,13,370,317,743,723,373,375,376,
            378,380,381,382,383,388,385,389,390,310,
            393,394,316,395,402,407,408,404,411,412,
            401,418,424,425,428,430,998,998
        };
    };
    public final static char baseAction[] = BaseAction.baseAction;
    public final int baseAction(int index) { return baseAction[index]; }
    public final static char lhs[] = baseAction;
    public final int lhs(int index) { return lhs[index]; };

    public interface TermCheck {
        public final static byte termCheck[] = {0,
            0,1,2,3,4,5,6,7,8,9,
            10,11,12,13,14,0,16,17,18,19,
            20,21,22,23,24,0,0,27,0,1,
            2,3,4,5,6,7,8,9,10,11,
            12,13,14,28,16,17,18,19,20,21,
            22,23,24,0,1,27,31,29,32,59,
            60,0,1,2,3,4,5,6,7,8,
            9,10,11,12,13,14,15,16,17,18,
            19,20,21,22,23,24,0,1,27,0,
            1,2,3,4,5,6,7,8,9,10,
            11,12,13,14,0,16,17,18,19,20,
            21,22,23,24,0,1,27,0,1,2,
            3,4,5,6,7,8,9,10,11,12,
            13,14,0,16,17,18,19,20,21,22,
            23,24,0,1,27,0,1,2,3,4,
            5,6,7,8,9,10,11,12,13,14,
            0,16,17,18,19,20,21,22,23,24,
            0,1,2,3,4,5,6,7,8,9,
            10,11,12,13,14,53,16,17,18,19,
            20,21,22,23,24,0,1,2,3,4,
            5,6,7,8,9,10,11,12,13,14,
            0,16,17,18,19,20,21,22,23,0,
            1,2,3,4,5,15,7,8,9,10,
            11,12,13,14,0,16,17,18,19,20,
            21,22,0,1,2,3,4,5,0,7,
            8,9,10,11,12,13,14,0,16,17,
            18,19,20,21,22,0,1,0,3,4,
            5,0,15,8,9,10,11,12,13,14,
            0,1,0,3,4,5,0,0,54,0,
            0,43,44,45,46,47,48,0,1,32,
            3,4,5,0,1,23,3,4,5,0,
            1,25,3,4,5,0,0,2,2,0,
            1,6,6,56,0,6,0,37,57,58,
            6,49,0,7,0,0,0,50,51,0,
            1,55,0,28,28,0,0,28,2,0,
            0,2,28,0,1,0,1,25,0,25,
            0,1,26,0,0,0,2,52,26,0,
            25,2,0,38,0,0,2,0,1,0,
            0,0,0,2,0,0,36,0,0,0,
            0,1,0,0,0,30,33,15,0,41,
            0,0,15,0,25,25,0,0,15,15,
            0,0,40,29,39,30,15,0,26,31,
            0,15,15,0,0,25,16,0,30,0,
            0,42,15,0,31,0,1,26,0,0,
            0,0,0,0,0,0,0,0,0,0,
            26,0,0,26,0,35,0,34,29,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0
        };
    };
    public final static byte termCheck[] = TermCheck.termCheck;
    public final int termCheck(int index) { return termCheck[index]; }

    public interface TermAction {
        public final static char termAction[] = {0,
            998,964,280,1080,1081,1082,779,1041,963,1065,
            1066,1067,1068,1069,1070,87,124,1060,1061,880,
            1057,1058,1059,762,968,75,998,970,998,964,
            280,1080,1081,1082,779,1041,963,1065,1066,1067,
            1068,1069,1070,905,124,1060,1061,880,1057,1058,
            1059,762,968,998,935,970,840,1055,997,893,
            887,998,964,280,1080,1081,1082,779,1041,963,
            1065,1066,1067,1068,1069,1070,1051,124,1060,1061,
            880,1057,1058,1059,762,968,998,931,970,998,
            964,280,1080,1081,1082,779,1041,963,1065,1066,
            1067,1068,1069,1070,998,124,1060,1061,880,1057,
            1058,1059,762,968,998,1557,970,998,982,280,
            1080,1081,1082,779,1041,963,1065,1066,1067,1068,
            1069,1070,90,124,1060,1061,880,1057,1058,1059,
            762,968,998,940,970,998,964,310,1080,1081,
            1082,779,1041,963,1065,1066,1067,1068,1069,1070,
            998,124,1060,1061,880,1057,1058,1059,762,968,
            998,964,280,1080,1081,1082,779,1041,963,1065,
            1066,1067,1068,1069,1070,186,124,1060,1061,880,
            1057,1058,1059,762,968,998,964,310,1080,1081,
            1082,779,1041,963,1065,1066,1067,1068,1069,1070,
            998,124,1060,1061,880,1057,1058,1059,762,998,
            964,310,1080,1081,1082,946,1041,963,1065,1066,
            1067,1068,1069,1070,93,124,1060,1061,880,1057,
            1058,1059,54,796,796,796,796,796,20,796,
            796,796,796,796,796,796,796,998,796,796,
            796,796,796,796,796,998,964,105,1080,1081,
            1082,107,948,963,1065,1066,1067,1068,1069,1070,
            998,931,28,1080,1081,1082,998,32,847,998,
            998,1020,1021,1022,1023,1024,1025,998,1441,97,
            1080,1081,1082,73,931,1029,1080,1081,1082,998,
            927,1093,925,923,922,87,87,156,156,109,
            931,912,912,1104,87,931,998,855,865,1106,
            912,1028,998,218,998,998,998,1032,1033,998,
            942,933,998,905,905,998,998,931,822,998,
            8,828,905,998,947,998,1121,1090,14,1094,
            998,921,220,18,998,41,340,400,250,998,
            1101,873,16,1079,998,6,370,998,978,998,
            998,998,998,861,998,114,513,54,77,998,
            119,921,998,998,998,813,682,1049,39,563,
            998,998,1364,121,1102,1100,998,998,1064,1062,
            998,998,659,1054,486,979,1050,998,538,188,
            12,988,990,998,998,1099,924,998,813,998,
            998,430,1063,998,883,111,1110,458,998,998,
            998,998,998,998,998,998,998,998,998,998,
            611,998,998,635,998,587,998,993,1008
        };
    };
    public final static char termAction[] = TermAction.termAction;
    public final int termAction(int index) { return termAction[index]; }

    public interface Asb {
        public final static char asb[] = {0,
            84,27,85,55,84,86,85,79,104,86,
            88,103,106,135,79,79,104,82,82,82,
            82,82,107,137,82,192,192,49,49,133,
            82,133,139,132,139,57,79,59,104,82,
            82,127,124,122,114,63,63,59,192,192,
            141,82,1,111,112,116,123,192,128,82,
            104,104,192,95,60,61,61,61,59,133,
            150,59,79,29,168,131,72,61,61,61,
            59,60,170,52,79,139,63,133,172,133,
            133,59,111,133,60,133,132,95,95,95,
            95,60,59,25,139,104,82,133,100,60,
            101,61,139,139,61,61,168,100
        };
    };
    public final static char asb[] = Asb.asb;
    public final int asb(int index) { return asb[index]; }

    public interface Asr {
        public final static byte asr[] = {0,
            2,6,23,7,1,3,4,5,8,9,
            10,11,12,13,14,19,22,18,17,20,
            21,24,27,29,16,0,32,0,2,6,
            23,7,8,9,10,11,12,13,14,19,
            16,22,18,17,20,21,24,27,3,4,
            5,15,1,0,7,0,59,60,27,24,
            6,23,7,2,19,16,22,18,17,20,
            21,8,9,10,11,12,13,14,3,4,
            5,1,0,53,54,32,56,1,3,4,
            5,58,57,0,2,15,31,30,0,35,
            34,0,55,25,0,6,1,38,55,28,
            30,50,51,49,23,43,44,45,46,47,
            48,33,40,34,35,41,36,26,25,39,
            29,31,15,0,37,0,38,0,26,0,
            34,35,26,29,31,25,2,6,28,33,
            36,39,40,41,43,44,45,46,47,48,
            49,23,50,51,30,15,0,29,0,42,
            0,33,36,15,39,40,41,43,44,45,
            46,47,48,49,23,50,51,30,52,6,
            28,2,0
        };
    };
    public final static byte asr[] = Asr.asr;
    public final int asr(int index) { return asr[index]; }

    public interface Nasb {
        public final static byte nasb[] = {0,
            31,12,33,12,31,24,33,6,12,24,
            29,12,12,12,6,17,12,45,45,27,
            35,12,12,12,12,12,12,13,13,12,
            12,12,12,12,12,1,20,1,12,37,
            39,12,12,12,41,1,1,5,12,12,
            12,27,1,43,47,49,12,12,12,12,
            12,12,12,51,1,1,1,1,1,12,
            12,1,6,1,12,12,9,1,1,1,
            1,1,12,39,12,12,1,12,12,12,
            12,1,43,12,1,12,12,51,51,51,
            51,1,1,12,12,12,39,12,53,1,
            12,1,12,12,1,1,12,53
        };
    };
    public final static byte nasb[] = Nasb.nasb;
    public final int nasb(int index) { return nasb[index]; }

    public interface Nasr {
        public final static byte nasr[] = {0,
            10,8,5,0,8,5,3,0,5,8,
            6,0,3,5,36,0,5,52,0,5,
            3,32,0,45,42,0,2,0,51,0,
            40,0,41,0,55,0,54,0,33,0,
            49,0,35,0,1,0,50,0,48,0,
            30,0,34,0
        };
    };
    public final static byte nasr[] = Nasr.nasr;
    public final int nasr(int index) { return nasr[index]; }

    public interface TerminalIndex {
        public final static byte terminalIndex[] = {0,
            30,4,43,44,45,11,31,46,47,48,
            49,50,51,52,5,6,32,33,37,38,
            39,40,22,35,28,3,34,2,7,25,
            26,61,36,41,42,1,8,9,10,12,
            13,14,15,16,17,18,19,20,21,23,
            24,27,53,54,55,56,57,58,59,60,
            62
        };
    };
    public final static byte terminalIndex[] = TerminalIndex.terminalIndex;
    public final int terminalIndex(int index) { return terminalIndex[index]; }

    public interface NonterminalIndex {
        public final static byte nonterminalIndex[] = {0,
            88,84,65,0,87,81,0,85,66,82,
            0,0,0,0,0,0,76,78,74,73,
            71,72,70,69,67,68,64,63,0,0,
            83,86,92,0,80,0,0,0,0,89,
            90,91,0,0,0,94,0,75,77,79,
            0,0,0,93,0,0
        };
    };
    public final static byte nonterminalIndex[] = NonterminalIndex.nonterminalIndex;
    public final int nonterminalIndex(int index) { return nonterminalIndex[index]; }

    public interface ScopePrefix {
        public final static byte scopePrefix[] = {
            37,47,7,78,1,18,71,59,13,22,
            25,30
        };
    };
    public final static byte scopePrefix[] = ScopePrefix.scopePrefix;
    public final int scopePrefix(int index) { return scopePrefix[index]; }

    public interface ScopeSuffix {
        public final static byte scopeSuffix[] = {
            16,54,5,83,5,5,75,63,16,5,
            28,33
        };
    };
    public final static byte scopeSuffix[] = ScopeSuffix.scopeSuffix;
    public final int scopeSuffix(int index) { return scopeSuffix[index]; }

    public interface ScopeLhs {
        public final static byte scopeLhs[] = {
            24,24,7,29,7,6,26,24,15,10,
            35,34
        };
    };
    public final static byte scopeLhs[] = ScopeLhs.scopeLhs;
    public final int scopeLhs(int index) { return scopeLhs[index]; }

    public interface ScopeLa {
        public final static byte scopeLa[] = {
            29,34,15,26,15,15,26,15,29,15,
            30,26
        };
    };
    public final static byte scopeLa[] = ScopeLa.scopeLa;
    public final int scopeLa(int index) { return scopeLa[index]; }

    public interface ScopeStateSet {
        public final static byte scopeStateSet[] = {
            20,20,7,25,7,7,22,20,8,8,
            4,1
        };
    };
    public final static byte scopeStateSet[] = ScopeStateSet.scopeStateSet;
    public final int scopeStateSet(int index) { return scopeStateSet[index]; }

    public interface ScopeRhs {
        public final static byte scopeRhs[] = {0,
            89,2,69,0,5,0,89,52,1,2,
            69,0,92,16,0,7,0,92,2,1,
            0,89,2,0,67,30,0,80,0,84,
            35,0,3,70,0,0,84,26,34,95,
            16,15,89,2,24,0,95,16,15,89,
            2,24,0,41,3,70,7,0,89,2,
            24,0,5,6,0,41,3,70,7,0,
            85,36,85,0,3,69,0,88,42,1,
            27,0,3,64,0
        };
    };
    public final static byte scopeRhs[] = ScopeRhs.scopeRhs;
    public final int scopeRhs(int index) { return scopeRhs[index]; }

    public interface ScopeState {
        public final static char scopeState[] = {0,
            928,924,0,919,903,0,813,635,611,587,
            796,659,723,743,703,682,563,779,762,538,
            513,458,430,486,400,188,370,156,340,310,
            124,280,250,220,0
        };
    };
    public final static char scopeState[] = ScopeState.scopeState;
    public final int scopeState(int index) { return scopeState[index]; }

    public interface InSymb {
        public final static byte inSymb[] = {0,
            0,108,98,53,101,99,102,54,7,103,
            106,64,1,66,57,112,55,28,6,37,
            64,113,1,63,116,1,1,2,2,97,
            64,97,15,1,15,26,31,26,89,60,
            59,85,82,81,78,23,6,2,69,8,
            1,19,16,71,79,80,83,24,87,27,
            89,115,94,1,36,41,33,110,2,89,
            64,2,2,2,92,89,30,111,109,40,
            2,39,1,2,30,85,15,89,1,64,
            92,31,67,89,42,114,94,5,4,3,
            1,26,52,15,88,15,31,89,16,26,
            95,35,34,84,26,26,84,84
        };
    };
    public final static byte inSymb[] = InSymb.inSymb;
    public final int inSymb(int index) { return inSymb[index]; }

    public interface Name {
        public final static String name[] = {
            "",
            "?",
            "::",
            ":",
            "(",
            ")",
            "{",
            "}",
            "[",
            "]",
            "->",
            "!",
            "&&",
            "||",
            "=",
            "==",
            "!=",
            ">=",
            "<=",
            ">",
            "<",
            "+",
            "-",
            "*",
            "/",
            ".",
            ",",
            "|",
            ";",
            "$empty",
            "IDENT",
            "STRING",
            "INT_CONST",
            "REAL_CONST",
            "let",
            "switch",
            "implies",
            "new",
            "false",
            "true",
            "null",
            "default",
            "case",
            "Collection",
            "List",
            "Set",
            "typeSelect",
            "collect",
            "select",
            "reject",
            "exists",
            "notExists",
            "forAll",
            "import",
            "extension",
            "reexport",
            "private",
            "create",
            "cached",
            "JAVA",
            "GLOBALVAR",
            "EOF_TOKEN",
            "ERROR_TOKEN",
            "expression",
            "castedExpression",
            "type",
            "infixExpression",
            "chainExpression",
            "ifExpression",
            "switchExpression",
            "orExpression",
            "andExpression",
            "impliesExpression",
            "relationalExpression",
            "additiveExpression",
            "relationalOperator",
            "multiplicativeExpression",
            "additiveOperator",
            "unaryExpression",
            "multiplicativeOperator",
            "infixExpressionSuffix",
            "featureCall",
            "primaryExpression",
            "parameterList",
            "simpleType",
            "collectionExpressionName",
            "declaredParameterList",
            "collectionTypeName",
            "qualifiedType",
            "nsImport",
            "extImport",
            "extensionDef",
            "javaType",
            "slot",
            "javaParams"
        };
    };
    public final static String name[] = Name.name;
    public final String name(int index) { return name[index]; }

    public final static int
           ERROR_SYMBOL      = 61,
           SCOPE_UBOUND      = 11,
           SCOPE_SIZE        = 12,
           MAX_NAME_LENGTH   = 24;

    public final int getErrorSymbol() { return ERROR_SYMBOL; }
    public final int getScopeUbound() { return SCOPE_UBOUND; }
    public final int getScopeSize() { return SCOPE_SIZE; }
    public final int getMaxNameLength() { return MAX_NAME_LENGTH; }

    public final static int
           NUM_STATES        = 118,
           NT_OFFSET         = 61,
           LA_STATE_OFFSET   = 1121,
           MAX_LA            = 2,
           NUM_RULES         = 123,
           NUM_NONTERMINALS  = 56,
           NUM_SYMBOLS       = 117,
           SEGMENT_SIZE      = 8192,
           START_STATE       = 862,
           IDENTIFIER_SYMBOL = 0,
           EOFT_SYMBOL       = 32,
           EOLT_SYMBOL       = 32,
           ACCEPT_ACTION     = 997,
           ERROR_ACTION      = 998;

    public final static boolean BACKTRACK = false;

    public final int getNumStates() { return NUM_STATES; }
    public final int getNtOffset() { return NT_OFFSET; }
    public final int getLaStateOffset() { return LA_STATE_OFFSET; }
    public final int getMaxLa() { return MAX_LA; }
    public final int getNumRules() { return NUM_RULES; }
    public final int getNumNonterminals() { return NUM_NONTERMINALS; }
    public final int getNumSymbols() { return NUM_SYMBOLS; }
    public final int getSegmentSize() { return SEGMENT_SIZE; }
    public final int getStartState() { return START_STATE; }
    public final int getStartSymbol() { return lhs[0]; }
    public final int getIdentifierSymbol() { return IDENTIFIER_SYMBOL; }
    public final int getEoftSymbol() { return EOFT_SYMBOL; }
    public final int getEoltSymbol() { return EOLT_SYMBOL; }
    public final int getAcceptAction() { return ACCEPT_ACTION; }
    public final int getErrorAction() { return ERROR_ACTION; }
    public final boolean isValidForParser() { return isValidForParser; }
    public final boolean getBacktrack() { return BACKTRACK; }

    public final int originalState(int state) {
        return -baseCheck[state];
    }
    public final int asi(int state) {
        return asb[originalState(state)];
    }
    public final int nasi(int state) {
        return nasb[originalState(state)];
    }
    public final int inSymbol(int state) {
        return inSymb[originalState(state)];
    }

    public final int ntAction(int state, int sym) {
        return baseAction[state + sym];
    }

    public final int tAction(int state, int sym) {
        int i = baseAction[state],
            k = i + sym;
        return termAction[termCheck[k] == sym ? k : i];
    }
    public final int lookAhead(int la_state, int sym) {
        int k = la_state + sym;
        return termAction[termCheck[k] == sym ? k : la_state];
    }
}
