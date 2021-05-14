package com.playerManagementSysOdev.Concrete;

import com.playerManagementSysOdev.Abstracts.GameManagerService;
import com.playerManagementSysOdev.Entities.Game;

public class GameManager implements GameManagerService {

    @Override
    public void add(Game game) {
        System.out.println(game.getGameName() + ": İsimli Oyun eklendi");
    }

    @Override
    public void delete(Game game) {
        System.out.println(game.getGameName() + ": İsimli Oyun Güncellendi");

    }

    @Override
    public void update(Game game) {
        System.out.println(game.getGameName() + ": İsimli Oyun Silindi");

    }

    @Override
    public void addMultiple(Game[] games) {
        for (Game game : games) {
            add(game);
        }

    }
}
