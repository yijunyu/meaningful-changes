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
            15,11,10,11,0,1,0,1,0,1,
            0,1,0,3,2,0,3,3,3,3,
            0,1,1,3,1,-53,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,-2,0,-74,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,-4,0,-93,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,-9,
            0,-36,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,-38,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,-48,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,-69,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,-72,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,-81,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,-100,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,-96,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,-111,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,-82,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,-65,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,-99,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,-66,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,-115,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,-118,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,-119,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            -80,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,-67,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,-68,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,-79,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,-78,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,-46,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            -47,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,-88,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,-77,0,0,0,0,0,
            0,0,0,-28,0,0,0,0,0,-29,
            0,0,0,0,0,-16,0,0,0,0,
            0,-37,0,0,0,0,0,-6,-8,0,
            0,0,0,0,-10,0,-20,0,0,0,
            -11,0,-97,-1,-3,0,-15,0,0,0,
            0,0,-7,0,-73,0,0,0,0,0,
            -21,-5,-52,0,0,-40,0,-113,0,0,
            0,0,0,0,-41,0,0,0,0,0,
            0,-45,0,0,-54,0,-18,0,-55,0,
            0,0,0,0,-19,0,-56,0,0,-63,
            0,0,-64,-85,-105,-94,-106,-107,-108,-110,
            -121,0,-12,-13,0,-14,0,-17,-22,0,
            -23,-24,-25,-26,-27,-30,-31,-32,0,-33,
            -34,0,0,0,0,-35,0,0,0,0,
            0,-39,-42,0,0,0,-43,-44,0,-49,
            -50,-51,-57,-58,-59,-60,-61,-62,-70,-71,
            -75,-76,-83,-84,-86,-87,-89,-90,-91,-92,
            -95,-98,-101,-102,-103,-104,-109,-112,-114,-116,
            -117,-120,0
        };
    };
    public final static byte baseCheck[] = BaseCheck.baseCheck;
    public final int baseCheck(int index) { return baseCheck[index]; }
    public final static byte rhs[] = baseCheck;
    public final int rhs(int index) { return rhs[index]; };

    public interface BaseAction {
        public final static char baseAction[] = {
            48,28,29,29,27,27,25,25,26,26,
            24,24,34,34,23,23,21,21,22,22,
            20,20,49,49,49,49,49,49,19,19,
            50,50,17,17,51,51,18,18,18,35,
            35,9,9,10,10,10,10,10,10,10,
            10,10,6,6,6,6,15,15,16,11,
            11,14,12,13,7,7,7,8,8,8,
            8,8,8,36,36,32,32,31,31,3,
            3,4,5,5,5,2,2,1,1,48,
            37,37,40,38,38,41,41,39,39,42,
            42,43,43,43,44,45,45,52,52,53,
            53,56,56,54,54,33,30,30,30,30,
            30,55,55,47,47,46,29,86,80,54,
            79,936,50,55,970,36,905,44,45,46,
            47,48,49,902,909,917,968,967,973,11,
            963,5,975,3,982,1,54,981,62,86,
            80,54,79,936,50,55,970,36,905,44,
            45,46,47,48,49,902,909,917,968,967,
            973,11,963,5,975,3,982,1,325,990,
            90,86,80,54,79,936,50,55,970,36,
            905,44,45,46,47,48,49,902,909,917,
            968,967,973,11,963,5,975,3,982,1,
            333,78,1,86,80,54,79,936,50,55,
            970,36,905,44,45,46,47,48,49,902,
            909,917,968,967,973,11,963,5,975,3,
            962,1,90,86,80,54,79,936,50,55,
            970,36,905,44,45,46,47,48,49,902,
            909,917,968,967,973,11,963,5,975,3,
            977,1,90,86,80,980,79,936,50,55,
            970,36,905,44,45,46,47,48,49,902,
            909,917,968,967,973,11,963,5,975,3,
            979,1,90,86,80,54,79,936,50,55,
            970,36,905,44,45,46,47,48,49,902,
            909,917,968,967,973,11,963,5,975,3,
            979,1,118,86,80,54,79,936,50,55,
            970,36,905,44,45,46,47,48,49,902,
            909,917,968,967,973,11,963,5,975,3,
            987,1,90,86,80,54,79,936,50,55,
            970,36,905,44,45,46,47,48,49,902,
            909,917,968,967,973,11,963,5,975,3,
            991,1,90,86,80,54,79,936,50,55,
            970,36,905,44,45,46,47,48,49,902,
            909,917,968,967,973,11,963,5,975,3,
            997,1,171,86,80,54,79,936,50,55,
            970,36,905,44,45,46,47,48,49,902,
            909,917,968,967,973,11,963,5,975,994,
            171,86,80,54,79,936,50,55,970,36,
            905,44,45,46,47,48,49,902,909,917,
            968,967,973,11,963,5,975,2,146,86,
            80,54,79,936,50,55,970,36,905,44,
            45,46,47,48,49,902,909,917,968,967,
            973,11,963,7,975,146,86,80,54,79,
            936,50,55,970,36,905,44,45,46,47,
            48,49,902,909,917,968,967,973,11,986,
            146,86,80,54,79,936,50,55,970,36,
            905,44,45,46,47,48,49,902,909,917,
            968,967,973,11,9,196,86,80,54,79,
            936,50,55,970,36,905,44,45,46,47,
            48,49,902,909,917,968,967,973,15,196,
            86,80,54,79,936,50,55,970,36,905,
            44,45,46,47,48,49,902,909,917,968,
            967,973,1001,196,86,80,54,79,936,50,
            55,970,36,905,44,45,46,47,48,49,
            902,909,917,968,967,973,1002,196,86,80,
            54,79,936,50,55,970,36,905,44,45,
            46,47,48,49,902,909,917,968,967,973,
            931,196,86,80,54,79,936,50,55,970,
            36,905,44,45,46,47,48,49,902,909,
            917,968,17,973,196,86,80,54,79,936,
            50,55,970,36,905,44,45,46,47,48,
            49,902,909,917,19,196,86,80,54,79,
            936,50,55,970,36,905,44,45,46,47,
            48,49,902,909,29,196,86,80,54,79,
            936,50,55,970,36,905,44,45,46,47,
            48,49,902,909,21,196,86,80,54,79,
            936,50,55,970,36,905,44,45,46,47,
            48,49,33,909,220,86,80,54,79,936,
            50,55,970,38,905,44,45,46,47,48,
            49,220,86,80,54,79,936,50,55,970,
            37,905,44,45,46,47,48,49,220,86,
            80,54,79,936,50,55,970,4,905,44,
            45,46,47,48,49,266,86,80,54,79,
            936,926,55,970,304,86,80,947,79,936,
            304,86,80,947,79,936,298,86,80,110,
            79,936,281,86,80,947,79,936,272,281,
            86,80,933,79,936,272,74,143,86,942,
            946,273,74,417,133,287,948,281,86,80,
            881,79,936,287,76,281,86,80,989,79,
            936,290,133,143,86,58,355,89,383,939,
            855,99,100,861,98,361,996,855,99,100,
            861,865,288,848,882,372,873,115,88,289,
            122,94,156,836,873,115,85,249,995,91,
            383,996,882,355,389,389,408,389,389,389,
            430,430,978,258,321,124,27,943,334,335,
            42,16,235,342,55,344,211,352,345,920,
            347,350,705,984,115,120,354,119,118,117,
            745,40,357,363,999,13,725,364,365,985,
            366,367,320,370,374,375,377,371,379,388,
            391,386,385,387,390,394,395,397,310,398,
            407,409,314,420,399,411,423,428,431,432,
            433,434,435,1005,1005
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
            22,23,24,0,0,27,2,29,32,59,
            60,0,1,2,3,4,5,6,7,8,
            9,10,11,12,13,14,15,16,17,18,
            19,20,21,22,23,24,0,34,27,0,
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
            18,19,20,21,22,0,1,33,3,4,
            5,0,0,8,9,10,11,12,13,14,
            0,1,25,3,4,5,0,0,0,0,
            1,43,44,45,46,47,48,0,1,0,
            3,4,5,0,1,34,3,4,5,0,
            23,2,55,0,1,6,3,4,5,0,
            0,2,0,1,0,6,6,56,6,57,
            58,7,0,0,0,1,49,28,50,51,
            54,0,1,0,0,2,0,28,28,0,
            28,0,1,0,0,1,0,25,25,15,
            0,52,0,0,0,0,0,2,2,0,
            0,0,26,0,0,2,0,1,0,26,
            31,25,0,1,0,0,0,0,0,0,
            0,2,32,0,0,25,0,0,0,35,
            38,30,15,25,41,15,0,0,0,40,
            0,15,15,39,29,31,0,1,30,0,
            26,15,0,15,26,15,33,0,42,0,
            0,0,0,0,0,16,0,30,0,1,
            0,0,15,0,0,0,0,0,0,0,
            0,0,0,31,0,25,0,0,26,26,
            0,0,0,29,0,0,37,36,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0
        };
    };
    public final static byte termCheck[] = TermCheck.termCheck;
    public final int termCheck(int index) { return termCheck[index]; }

    public interface TermAction {
        public final static char termAction[] = {0,
            1005,972,282,1087,1088,1089,781,1048,971,1072,
            1073,1074,1075,1076,1077,87,126,1067,1068,883,
            1064,1065,1066,764,974,1005,1005,976,1005,972,
            282,1087,1088,1089,781,1048,971,1072,1073,1074,
            1075,1076,1077,907,126,1067,1068,883,1064,1065,
            1066,764,974,1005,1005,976,824,1062,857,895,
            886,1005,972,282,1087,1088,1089,781,1048,971,
            1072,1073,1074,1075,1076,1077,1058,126,1067,1068,
            883,1064,1065,1066,764,974,1005,1004,976,1005,
            972,282,1087,1088,1089,781,1048,971,1072,1073,
            1074,1075,1076,1077,1005,126,1067,1068,883,1064,
            1065,1066,764,974,1005,941,976,1005,988,282,
            1087,1088,1089,781,1048,971,1072,1073,1074,1075,
            1076,1077,90,126,1067,1068,883,1064,1065,1066,
            764,974,1005,934,976,1005,972,312,1087,1088,
            1089,781,1048,971,1072,1073,1074,1075,1076,1077,
            1005,126,1067,1068,883,1064,1065,1066,764,974,
            1005,972,282,1087,1088,1089,781,1048,971,1072,
            1073,1074,1075,1076,1077,188,126,1067,1068,883,
            1064,1065,1066,764,974,1005,972,312,1087,1088,
            1089,781,1048,971,1072,1073,1074,1075,1076,1077,
            1005,126,1067,1068,883,1064,1065,1066,764,1005,
            972,312,1087,1088,1089,950,1048,971,1072,1073,
            1074,1075,1076,1077,1005,126,1067,1068,883,1064,
            1065,1066,54,798,798,798,798,798,20,798,
            798,798,798,798,798,798,798,1005,798,798,
            798,798,798,798,798,1005,972,1086,1087,1088,
            1089,105,107,971,1072,1073,1074,1075,1076,1077,
            1005,934,1100,1087,1088,1089,93,28,32,1005,
            1569,1027,1028,1029,1030,1031,1032,1005,1453,1005,
            1087,1088,1089,73,934,97,1087,1088,1089,87,
            1036,158,938,1005,929,915,928,927,925,87,
            87,158,109,934,1005,915,915,1111,934,867,
            1113,220,1005,1005,1005,944,1035,907,1039,1040,
            849,1005,945,1005,1005,830,1005,907,907,75,
            934,1005,951,1005,1005,1130,1005,1097,1101,956,
            113,402,8,14,18,1005,1005,342,875,16,
            1005,41,222,1005,6,372,1005,983,1005,252,
            842,1108,1005,924,77,1005,1005,1005,116,1005,
            54,863,923,1005,1005,1109,1005,1005,1005,684,
            515,815,1056,1107,565,1373,1005,39,1005,661,
            1005,1071,1069,488,1061,190,121,924,992,1005,
            540,1057,123,993,460,998,1119,1005,432,12,
            1005,1005,1005,1005,1005,930,1005,815,111,1117,
            1005,1005,1070,1005,1005,1005,1005,1005,1005,1005,
            1005,1005,1005,888,1005,1106,1005,1005,613,637,
            1005,1005,1005,1015,1005,1005,589,1000
        };
    };
    public final static char termAction[] = TermAction.termAction;
    public final int termAction(int index) { return termAction[index]; }

    public interface Asb {
        public final static char asb[] = {0,
            84,27,85,55,84,86,85,79,107,86,
            88,106,109,96,79,79,107,82,82,82,
            82,82,110,138,82,193,193,49,49,136,
            82,136,140,135,140,57,79,59,107,82,
            95,130,127,125,117,63,63,59,193,193,
            142,82,1,114,115,119,126,193,131,82,
            107,107,82,82,60,61,61,61,59,136,
            151,59,79,29,169,134,72,61,61,61,
            59,60,171,193,98,138,140,63,136,173,
            136,136,59,114,136,60,52,79,60,59,
            25,140,136,135,98,98,98,98,136,103,
            60,107,82,104,61,140,140,61,61,169,
            103
        };
    };
    public final static char asb[] = Asb.asb;
    public final int asb(int index) { return asb[index]; }

    public interface Asr {
        public final static byte asr[] = {0,
            2,6,23,7,1,3,4,5,8,9,
            10,11,12,13,14,19,22,18,17,20,
            21,24,27,29,16,0,34,0,2,6,
            23,7,8,9,10,11,12,13,14,19,
            16,22,18,17,20,21,24,27,3,4,
            5,15,1,0,7,0,59,60,27,24,
            6,23,7,2,19,16,22,18,17,20,
            21,8,9,10,11,12,13,14,3,4,
            5,1,0,53,54,34,56,1,3,4,
            5,58,57,0,1,32,0,2,15,31,
            30,0,37,36,0,55,25,0,6,1,
            33,55,28,30,50,51,49,23,43,44,
            45,46,47,48,35,40,36,37,41,38,
            26,25,39,29,31,15,0,33,0,26,
            0,36,37,26,29,31,25,2,6,28,
            35,38,39,40,41,43,44,45,46,47,
            48,49,23,50,51,30,15,0,29,0,
            42,0,35,38,15,39,40,41,43,44,
            45,46,47,48,49,23,50,51,30,52,
            6,28,2,0
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
            12,12,51,37,1,1,1,1,1,12,
            12,1,6,1,12,12,9,1,1,1,
            1,1,12,12,53,12,12,1,12,12,
            12,12,1,43,12,1,51,12,1,1,
            12,12,12,12,53,53,53,53,12,55,
            1,12,51,12,1,12,12,1,1,12,
            55
        };
    };
    public final static byte nasb[] = Nasb.nasb;
    public final int nasb(int index) { return nasb[index]; }

    public interface Nasr {
        public final static byte nasr[] = {0,
            10,8,5,0,8,5,3,0,5,8,
            6,0,3,5,36,0,5,53,0,5,
            3,32,0,45,42,0,2,0,52,0,
            40,0,41,0,56,0,46,0,54,0,
            50,0,35,0,1,0,51,0,49,0,
            33,0,30,0,34,0
        };
    };
    public final static byte nasr[] = Nasr.nasr;
    public final int nasr(int index) { return nasr[index]; }

    public interface TerminalIndex {
        public final static byte terminalIndex[] = {0,
            30,4,43,44,45,11,31,46,47,48,
            49,50,51,52,5,6,32,33,37,38,
            39,40,22,35,28,3,34,2,7,25,
            26,8,9,61,36,41,42,1,10,12,
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
            90,91,0,0,0,93,94,0,75,77,
            79,0,0,0,0,0,0
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
            29,36,15,26,15,15,26,15,29,15,
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
            37,0,3,70,0,0,84,26,36,95,
            16,15,89,2,24,0,95,16,15,89,
            2,24,0,41,3,70,7,0,89,2,
            24,0,5,6,0,41,3,70,7,0,
            85,38,85,0,3,69,0,88,42,1,
            27,0,3,64,0
        };
    };
    public final static byte scopeRhs[] = ScopeRhs.scopeRhs;
    public final int scopeRhs(int index) { return scopeRhs[index]; }

    public interface ScopeState {
        public final static char scopeState[] = {0,
            931,930,0,926,905,0,815,637,613,589,
            798,661,725,745,705,684,565,781,764,540,
            515,460,432,488,402,190,372,158,342,312,
            126,282,252,222,0
        };
    };
    public final static char scopeState[] = ScopeState.scopeState;
    public final int scopeState(int index) { return scopeState[index]; }

    public interface InSymb {
        public final static byte inSymb[] = {0,
            0,109,98,53,101,99,102,54,7,103,
            106,64,1,66,57,113,55,28,6,32,
            64,114,1,63,117,1,1,2,2,97,
            64,97,15,1,15,26,31,26,89,60,
            59,85,82,81,78,23,6,2,69,8,
            1,19,16,71,79,80,83,24,87,27,
            89,107,115,32,38,41,35,111,2,89,
            64,2,2,2,92,89,30,112,110,40,
            2,39,1,94,1,107,85,15,89,1,
            64,92,31,67,89,42,2,30,26,52,
            15,88,116,94,5,4,3,1,89,16,
            26,15,31,95,37,36,84,26,26,84,
            84
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
           NUM_STATES        = 121,
           NT_OFFSET         = 61,
           LA_STATE_OFFSET   = 1130,
           MAX_LA            = 2,
           NUM_RULES         = 125,
           NUM_NONTERMINALS  = 57,
           NUM_SYMBOLS       = 118,
           SEGMENT_SIZE      = 8192,
           START_STATE       = 864,
           IDENTIFIER_SYMBOL = 0,
           EOFT_SYMBOL       = 34,
           EOLT_SYMBOL       = 34,
           ACCEPT_ACTION     = 1004,
           ERROR_ACTION      = 1005;

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