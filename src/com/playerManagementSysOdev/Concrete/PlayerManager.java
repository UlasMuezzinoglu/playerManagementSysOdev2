package com.playerManagementSysOdev.Concrete;

import com.playerManagementSysOdev.Abstracts.PlayerCheckService;
import com.playerManagementSysOdev.Abstracts.PlayerManagerService;
import com.playerManagementSysOdev.Entities.Player;

public class PlayerManager implements PlayerManagerService {
    PlayerCheckService playerCheckService;

    public PlayerManager(PlayerCheckService playerCheckService) {
        this.playerCheckService = playerCheckService;
    }

    @Override
    public void add(Player player) {
        if (this.playerCheckService.isPersonReal(player)) {
            System.out.println(player.getFirstName() + " " + player.getLastName() + ": " + "İsimli oyuncu sisteme eklendi");
        }else{
            System.out.println("Oyuncu Sisteme Eklenemedi. Gerçek Bir Kişi Değil.");
        }
    }

    @Override
    public void update(Player player) {
        System.out.println(player.getFirstName() + " " + player.getLastName() + ": " + "İsimli oyuncu sistemde Güncellendi");

    }

    @Override
    public void delete(Player player) {
        System.out.println(player.getFirstName() + " " + player.getLastName() + ": " + "İsimli oyuncu sistemden silindi");

    }
}
