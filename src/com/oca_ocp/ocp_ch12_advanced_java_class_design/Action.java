package com.oca_ocp.ocp_ch12_advanced_java_class_design;

import java.util.Objects;


/*Q6 */
enum Action {
    DODGE { // if comment the realisation of method it will not compile
        public boolean execute(Player player) {
            return player.isAttacking();
        }
    },
    ATTACK {
        public boolean execute(Player player) {
            return player.hasWeapon();
        }
    },
    JUMP {
        public boolean execute(Player player) {
            return player.getCoordinates().equals(new Coordinates(0, 0));
        }
    };

    public abstract boolean execute(Player player);
}

class Player {



    protected boolean isAttacking() { return true; }

    public boolean hasWeapon() { return true;    }

    public Coordinates getCoordinates() {
        return new Coordinates(0,0);
    }
}

class Coordinates  {

    public Coordinates(int x , int y ) {
    }
}