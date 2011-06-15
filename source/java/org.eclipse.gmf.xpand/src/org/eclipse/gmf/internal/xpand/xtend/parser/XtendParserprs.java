/*******************************************************************************
* Copyright (c) 2006, 2007 Eclipse.org
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
            0,1,1,3,1,-52,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,-2,0,-72,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,-4,0,-92,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,-9,
            0,-36,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,-38,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,-47,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,-67,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,-70,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,-80,0,0,0,0,0,0,0,0,
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
            0,0,0,0,0,0,0,-81,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,-64,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,-99,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,-65,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,-115,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,-118,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,-119,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            -79,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,-66,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,-78,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,-76,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,-77,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,-45,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,-46,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,-87,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,-75,0,0,0,0,0,0,
            0,0,-28,0,0,0,0,0,-29,0,
            0,0,0,0,-16,0,0,0,0,0,
            -37,0,0,0,0,0,-6,-8,0,0,
            0,0,0,-10,0,-20,0,0,-11,0,
            0,-97,-1,-3,-54,0,-15,0,0,0,
            0,0,0,-71,0,0,0,0,0,-5,
            -7,-51,0,0,-21,-113,0,0,-55,0,
            0,0,0,0,0,-40,0,0,0,0,
            0,-41,0,0,-62,0,-18,0,-53,0,
            0,0,-19,0,-63,0,0,0,0,0,
            0,-84,0,0,-93,-12,-105,-94,-106,-107,
            -13,-110,-121,0,-108,-14,-17,0,0,-22,
            0,-23,0,-24,0,-25,-26,-27,-30,-31,
            -32,0,-33,-34,-35,0,0,-39,0,0,
            0,0,0,-42,0,0,0,-43,-44,-48,
            -49,-50,-56,-57,-58,-59,-60,-61,-68,-69,
            -73,-74,-82,-83,-85,-86,-88,-89,-90,-91,
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
            49,28,29,29,27,27,25,25,26,26,
            24,24,34,34,23,23,21,21,22,22,
            20,20,50,50,50,50,50,50,19,19,
            35,35,17,17,51,51,18,18,18,36,
            36,9,9,10,10,10,10,10,10,10,
            10,10,6,6,6,6,15,15,16,11,
            11,14,12,13,7,7,7,8,8,8,
            8,8,8,37,37,32,32,31,31,3,
            3,4,5,5,5,2,2,1,1,49,
            38,38,41,39,39,42,42,40,40,43,
            43,44,44,44,45,46,46,52,52,53,
            53,56,56,54,54,33,30,30,30,30,
            30,55,55,48,48,47,29,86,80,54,
            79,936,50,55,970,36,909,44,45,46,
            47,48,49,28,865,889,969,968,973,11,
            964,5,975,3,982,1,301,981,62,86,
            80,54,79,936,50,55,970,36,909,44,
            45,46,47,48,49,28,865,889,969,968,
            973,11,964,5,975,3,982,1,323,990,
            90,86,80,54,79,936,50,55,970,36,
            909,44,45,46,47,48,49,28,865,889,
            969,968,973,11,964,5,975,3,982,1,
            327,78,1,86,80,54,79,936,50,55,
            970,36,909,44,45,46,47,48,49,28,
            865,889,969,968,973,11,964,5,975,3,
            958,1,90,86,80,54,79,936,50,55,
            970,36,909,44,45,46,47,48,49,28,
            865,889,969,968,973,11,964,5,975,3,
            977,1,90,86,80,980,79,936,50,55,
            970,36,909,44,45,46,47,48,49,28,
            865,889,969,968,973,11,964,5,975,3,
            979,1,90,86,80,54,79,936,50,55,
            970,36,909,44,45,46,47,48,49,28,
            865,889,969,968,973,11,964,5,975,3,
            979,1,118,86,80,54,79,936,50,55,
            970,36,909,44,45,46,47,48,49,28,
            865,889,969,968,973,11,964,5,975,3,
            987,1,90,86,80,54,79,936,50,55,
            970,36,909,44,45,46,47,48,49,28,
            865,889,969,968,973,11,964,5,975,3,
            991,1,90,86,80,54,79,936,50,55,
            970,36,909,44,45,46,47,48,49,28,
            865,889,969,968,973,11,964,5,975,3,
            997,1,171,86,80,54,79,936,50,55,
            970,36,909,44,45,46,47,48,49,28,
            865,889,969,968,973,11,964,5,975,994,
            171,86,80,54,79,936,50,55,970,36,
            909,44,45,46,47,48,49,28,865,889,
            969,968,973,11,964,5,975,2,146,86,
            80,54,79,936,50,55,970,36,909,44,
            45,46,47,48,49,28,865,889,969,968,
            973,11,964,7,975,146,86,80,54,79,
            936,50,55,970,36,909,44,45,46,47,
            48,49,28,865,889,969,968,973,11,986,
            146,86,80,54,79,936,50,55,970,36,
            909,44,45,46,47,48,49,28,865,889,
            969,968,973,11,9,196,86,80,54,79,
            936,50,55,970,36,909,44,45,46,47,
            48,49,28,865,889,969,968,973,15,196,
            86,80,54,79,936,50,55,970,36,909,
            44,45,46,47,48,49,28,865,889,969,
            968,973,1001,196,86,80,54,79,936,50,
            55,970,36,909,44,45,46,47,48,49,
            28,865,889,969,968,973,1002,196,86,80,
            54,79,936,50,55,970,36,909,44,45,
            46,47,48,49,28,865,889,969,968,973,
            933,196,86,80,54,79,936,50,55,970,
            36,909,44,45,46,47,48,49,28,865,
            889,969,17,973,196,86,80,54,79,936,
            50,55,970,36,909,44,45,46,47,48,
            49,28,865,889,19,196,86,80,54,79,
            936,50,55,970,36,909,44,45,46,47,
            48,49,28,865,928,196,86,80,54,79,
            936,50,55,970,36,909,44,45,46,47,
            48,49,33,865,196,86,80,54,79,936,
            50,55,970,36,909,44,45,46,47,48,
            49,29,865,220,86,80,54,79,936,50,
            55,970,38,909,44,45,46,47,48,49,
            220,86,80,54,79,936,50,55,970,37,
            909,44,45,46,47,48,49,220,86,80,
            54,79,936,50,55,970,4,909,44,45,
            46,47,48,49,266,86,80,54,79,936,
            925,55,970,299,86,80,950,79,936,299,
            86,80,950,79,936,287,86,80,110,79,
            936,281,86,80,950,79,936,273,281,86,
            80,926,79,936,273,74,87,86,944,268,
            949,74,419,133,320,289,951,281,86,80,
            885,79,936,76,281,86,80,989,79,936,
            133,320,87,86,58,115,385,89,940,249,
            854,99,100,859,98,996,355,854,99,100,
            859,864,358,847,880,385,881,54,88,375,
            122,835,156,54,85,355,725,995,91,996,
            94,880,393,881,744,397,306,393,328,393,
            393,316,430,430,124,393,27,334,984,705,
            143,946,16,978,332,42,337,345,348,211,
            341,349,115,353,26,354,905,120,335,119,
            118,40,985,744,363,117,999,13,366,367,
            368,369,315,372,376,377,381,373,384,389,
            391,383,387,388,392,395,396,399,305,400,
            401,410,309,421,407,411,424,429,432,434,
            435,436,438,1005,1005
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
            5,23,0,8,9,10,11,12,13,14,
            0,1,34,3,4,5,0,1,0,3,
            4,5,44,45,46,47,48,49,0,1,
            0,3,4,5,0,0,2,35,0,1,
            6,3,4,5,0,0,2,0,1,0,
            6,6,0,6,57,58,0,0,56,7,
            25,0,28,0,0,35,0,1,50,51,
            0,1,28,28,0,28,2,0,0,2,
            23,25,0,0,0,1,52,0,25,25,
            55,34,0,15,33,0,0,0,0,2,
            2,0,0,54,0,0,0,2,26,26,
            0,1,0,0,0,1,0,0,0,32,
            0,0,0,2,0,0,0,25,0,0,
            0,39,36,15,30,15,0,42,25,0,
            0,29,41,15,15,15,40,31,0,1,
            0,26,30,0,15,15,30,33,0,0,
            43,0,26,0,0,0,16,0,0,1,
            0,0,0,15,0,0,0,0,0,0,
            0,0,0,0,31,0,25,0,0,0,
            26,26,0,0,0,0,29,38,0,0,
            37,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0
        };
    };
    public final static byte termCheck[] = TermCheck.termCheck;
    public final int termCheck(int index) { return termCheck[index]; }

    public interface TermAction {
        public final static char termAction[] = {0,
            1005,972,282,1087,1088,1089,780,1048,971,1072,
            1073,1074,1075,1076,1077,87,126,1067,1068,882,
            1064,1065,1066,763,974,75,1005,976,1005,972,
            282,1087,1088,1089,780,1048,971,1072,1073,1074,
            1075,1076,1077,907,126,1067,1068,882,1064,1065,
            1066,763,974,1005,942,976,841,1062,856,902,
            896,1005,972,282,1087,1088,1089,780,1048,971,
            1072,1073,1074,1075,1076,1077,1058,126,1067,1068,
            882,1064,1065,1066,763,974,1005,931,976,1005,
            972,282,1087,1088,1089,780,1048,971,1072,1073,
            1074,1075,1076,1077,1005,126,1067,1068,882,1064,
            1065,1066,763,974,1005,1569,976,1005,988,282,
            1087,1088,1089,780,1048,971,1072,1073,1074,1075,
            1076,1077,90,126,1067,1068,882,1064,1065,1066,
            763,974,1005,947,976,1005,972,312,1087,1088,
            1089,780,1048,971,1072,1073,1074,1075,1076,1077,
            1005,126,1067,1068,882,1064,1065,1066,763,974,
            1005,972,282,1087,1088,1089,780,1048,971,1072,
            1073,1074,1075,1076,1077,188,126,1067,1068,882,
            1064,1065,1066,763,974,1005,972,312,1087,1088,
            1089,780,1048,971,1072,1073,1074,1075,1076,1077,
            1005,126,1067,1068,882,1064,1065,1066,763,1005,
            972,312,1087,1088,1089,953,1048,971,1072,1073,
            1074,1075,1076,1077,1005,126,1067,1068,882,1064,
            1065,1066,54,797,797,797,797,797,20,797,
            797,797,797,797,797,797,797,1005,797,797,
            797,797,797,797,797,1005,972,107,1087,1088,
            1089,1036,105,971,1072,1073,1074,1075,1076,1077,
            1005,931,1035,1087,1088,1089,1005,1448,32,1087,
            1088,1089,1027,1028,1029,1030,1031,1032,73,931,
            1005,1087,1088,1089,87,1005,158,97,1005,935,
            913,930,929,927,87,87,158,109,931,93,
            913,913,1005,931,867,1113,1005,21,1111,220,
            1100,1005,907,1005,1005,1004,1005,948,1039,1040,
            1005,954,907,907,1005,931,823,1005,1005,829,
            1036,1097,1005,1005,1005,1130,402,113,1101,1108,
            937,1035,8,955,1086,14,18,1005,1005,342,
            874,16,1005,848,41,1005,6,372,222,252,
            1005,983,1005,1005,1005,922,77,1005,1005,915,
            54,1005,116,862,1005,1005,39,1109,1005,1005,
            1005,515,684,1056,814,1373,1005,565,1107,1005,
            1005,1061,661,1071,1069,1057,488,190,121,922,
            1005,540,992,123,993,998,814,1119,1005,12,
            432,1005,460,1005,1005,1005,932,1005,111,1117,
            1005,1005,1005,1070,1005,1005,1005,1005,1005,1005,
            1005,1005,1005,1005,886,1005,1106,1005,1005,1005,
            613,637,1005,1005,1005,1005,1015,589,1005,1005,
            1000
        };
    };
    public final static char termAction[] = TermAction.termAction;
    public final int termAction(int index) { return termAction[index]; }

    public interface Asb {
        public final static char asb[] = {0,
            84,27,85,55,84,86,85,79,104,86,
            88,103,106,96,79,79,104,82,82,82,
            82,82,107,138,82,193,193,49,49,133,
            82,133,140,132,140,57,79,59,104,82,
            95,127,124,122,63,63,59,193,193,142,
            82,1,111,112,114,123,193,128,82,104,
            104,82,82,60,61,61,59,133,151,59,
            79,29,169,131,72,61,61,61,61,59,
            60,171,193,98,138,140,63,133,173,133,
            133,59,111,120,133,60,52,79,60,59,
            25,140,133,132,98,98,98,98,133,135,
            60,104,82,136,61,140,140,61,61,169,
            135
        };
    };
    public final static char asb[] = Asb.asb;
    public final int asb(int index) { return asb[index]; }

    public interface Asr {
        public final static byte asr[] = {0,
            2,6,23,7,1,3,4,5,8,9,
            10,11,12,13,14,19,22,18,17,20,
            21,24,27,29,16,0,35,0,2,6,
            23,7,8,9,10,11,12,13,14,19,
            16,22,18,17,20,21,24,27,3,4,
            5,15,1,0,7,0,59,60,27,24,
            6,23,7,2,19,16,22,18,17,20,
            21,8,9,10,11,12,13,14,3,4,
            5,1,0,53,54,35,56,1,3,4,
            5,58,57,0,1,32,0,2,15,31,
            30,0,55,25,0,6,1,33,55,28,
            30,50,51,44,45,46,47,48,49,34,
            23,36,41,37,38,42,39,26,25,40,
            29,31,15,0,38,37,0,33,0,26,
            0,37,38,26,29,31,25,2,6,28,
            36,39,40,41,42,44,45,46,47,48,
            49,34,23,50,51,30,15,0,29,0,
            43,0,36,39,15,40,41,42,44,45,
            46,47,48,49,34,23,50,51,30,52,
            6,28,2,0
        };
    };
    public final static byte asr[] = Asr.asr;
    public final int asr(int index) { return asr[index]; }

    public interface Nasb {
        public final static byte nasb[] = {0,
            31,12,33,12,31,24,33,6,12,24,
            29,12,12,12,6,17,12,48,48,27,
            37,12,12,12,12,12,12,13,13,12,
            12,12,12,12,12,1,20,1,12,42,
            44,12,12,12,1,1,5,12,12,12,
            27,1,50,35,39,12,12,12,12,12,
            12,46,42,1,1,1,1,12,12,1,
            6,1,12,12,9,1,1,1,1,1,
            1,12,12,52,12,12,1,12,12,12,
            12,1,50,40,12,1,46,12,1,1,
            12,12,12,12,52,52,52,52,12,54,
            1,12,46,12,1,12,12,1,1,12,
            54
        };
    };
    public final static byte nasb[] = Nasb.nasb;
    public final int nasb(int index) { return nasb[index]; }

    public interface Nasr {
        public final static byte nasr[] = {0,
            10,8,5,0,8,5,3,0,5,8,
            6,0,3,5,37,0,5,53,0,5,
            3,32,0,46,43,0,2,0,52,0,
            41,0,42,0,51,0,56,0,50,35,
            0,47,0,54,0,33,0,1,0,36,
            0,30,0,34,0
        };
    };
    public final static byte nasr[] = Nasr.nasr;
    public final int nasr(int index) { return nasr[index]; }

    public interface TerminalIndex {
        public final static byte terminalIndex[] = {0,
            30,4,43,44,45,11,31,46,47,48,
            49,50,51,52,5,6,32,33,37,38,
            39,40,22,35,28,3,34,2,7,25,
            26,8,9,21,61,36,41,42,1,10,
            12,13,14,15,16,17,18,19,20,23,
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
            83,86,92,0,77,80,0,0,0,0,
            89,90,91,0,0,0,93,94,0,75,
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
            36,34
        };
    };
    public final static byte scopeLhs[] = ScopeLhs.scopeLhs;
    public final int scopeLhs(int index) { return scopeLhs[index]; }

    public interface ScopeLa {
        public final static byte scopeLa[] = {
            29,37,15,26,15,15,26,15,29,15,
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
            38,0,3,70,0,0,84,26,37,95,
            16,15,89,2,24,0,95,16,15,89,
            2,24,0,41,3,70,7,0,89,2,
            24,0,5,6,0,41,3,70,7,0,
            85,39,85,0,3,69,0,88,43,1,
            27,0,3,64,0
        };
    };
    public final static byte scopeRhs[] = ScopeRhs.scopeRhs;
    public final int scopeRhs(int index) { return scopeRhs[index]; }

    public interface ScopeState {
        public final static char scopeState[] = {0,
            933,932,0,925,909,0,814,637,613,589,
            797,661,705,744,725,684,565,780,763,540,
            515,460,432,488,402,190,372,158,342,312,
            126,282,252,222,0
        };
    };
    public final static char scopeState[] = ScopeState.scopeState;
    public final int scopeState(int index) { return scopeState[index]; }

    public interface InSymb {
        public final static byte inSymb[] = {0,
            0,110,99,53,102,100,103,54,7,104,
            107,64,1,66,57,113,55,28,6,32,
            64,114,1,63,117,1,1,2,2,98,
            64,98,15,1,15,26,31,26,89,60,
            59,85,82,81,23,6,2,69,8,1,
            19,16,71,79,80,83,24,87,27,89,
            108,115,32,39,42,36,2,89,64,2,
            2,2,92,89,30,112,96,111,41,2,
            40,1,94,1,108,85,15,89,1,64,
            92,31,67,80,89,43,2,30,26,52,
            15,88,116,94,5,4,3,1,89,16,
            26,15,31,95,38,37,84,26,26,84,
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
           START_STATE       = 863,
           IDENTIFIER_SYMBOL = 0,
           EOFT_SYMBOL       = 35,
           EOLT_SYMBOL       = 35,
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
