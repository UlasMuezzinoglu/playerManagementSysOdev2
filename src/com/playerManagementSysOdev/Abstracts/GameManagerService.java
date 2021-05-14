package com.playerManagementSysOdev.Abstracts;

import com.playerManagementSysOdev.Entities.Game;

public interface GameManagerService {
    void add(Game game);
    void delete(Game game);
    void update(Game game);
    void addMultiple(Game[] games);

}
