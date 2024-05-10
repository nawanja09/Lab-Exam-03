package com.example.labexam03

interface GameTask {

    fun closeGame(mScore:Int)
    abstract fun <GameView> GameView(c: MainActivity): GameView
}


