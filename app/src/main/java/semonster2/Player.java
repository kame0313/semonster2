package semonster2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Player {
    String name;// Player name
    int hp;
  ArrayList<Monster> monsterDeck = new ArrayList<>();
  LinkedList<Integer> randomNumberList;// randomな0~4の数値を必要な数保存しておく

  Player(LinkedList<Integer> randomNumberList, String playerName) {
    this.randomNumberList = randomNumberList;
    this.name = playerName;
    this.hp = 3;
}

public void drawMonsters() {
    for (int i = 0; i < 8; i++) {
      this.monsterDeck.add(new Monster(this.randomNumberList.pop(), this.randomNumberList.pop()));
    }
}

public int getHp(){
  return this.hp;
}

@Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Deck:" + this.name + "\n");
    for (Monster m : this.monsterDeck) {
      sb.append(m);
    }
    return sb.toString();
  }
}

