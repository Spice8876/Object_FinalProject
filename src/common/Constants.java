package common;

public class Constants {

    static public final int MaxHeight = 960;
    static public final int MaxWidth = 480;

    static public class InGame{
        static public final int InputAreaTopY = 800;
        static public final int InputAreaBottomY = 800 + 20;

        static public final int Speed = 3;
        static public final int tick = 10;

        static public int NodeReadyTime = InputAreaTopY * tick / Speed;

        static public class KeyBoardTable{
            static public final int Width = MaxWidth;
            static public final int Height = 60;
        }

        static public class Layer{
            static public final int KeyBoardTable = 200;
        }
    }


}

