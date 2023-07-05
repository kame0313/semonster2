package semonster2;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class PlayerTest {
    @Test
    public void testDrawMonsters() {
        LinkedList<Integer> randomNumberList = new LinkedList<>(); // 任意のランダム数値のリストを作成
        randomNumberList.add(0); // モンスターの名前インデックス
        randomNumberList.add(3); // レア度

        Player player = new Player(randomNumberList, "プレイヤー名");
        player.drawMonsters();

        Assert.assertEquals(8, player.monsterDeck.size());
    }
}
