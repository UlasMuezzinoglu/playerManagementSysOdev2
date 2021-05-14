package com.playerManagementSysOdev.Abstracts;

import com.playerManagementSysOdev.Entities.Campaign;
import com.playerManagementSysOdev.Entities.Game;
import com.playerManagementSysOdev.Entities.Player;

public interface CheckoutManagerService {
    void saleGame(Game game, Player player);
    void saleGameWithCampaign(Game game,Player player, Campaign campaign);
}
