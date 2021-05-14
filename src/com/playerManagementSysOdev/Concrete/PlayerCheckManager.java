package com.playerManagementSysOdev.Concrete;

import com.playerManagementSysOdev.Abstracts.PlayerCheckService;
import com.playerManagementSysOdev.Entities.Player;

public class PlayerCheckManager implements PlayerCheckService {
    @Override
    public boolean isPersonReal(Player player) {
        return true;
    }
}
