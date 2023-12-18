package com.study.learnspringframework;

import com.study.learnspringframework.game.GameRunner;
import com.study.learnspringframework.game.MarioGame;

public class AppGamingBasic {

    public static void main(String[] args){

        //var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }
}
