package com.playerManagementSysOdev.Abstracts;

import com.playerManagementSysOdev.Entities.Player;

public interface PlayerManagerService {
    void add(Player player);
    void update(Player player);
    void delete(Player player);
}
