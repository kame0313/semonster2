package semonster2;

public class Monster {
  private String name;
  private int rare; // 戦うとレア度が高いほうが勝つ．同じ場合は引き分け
  private int evo;//進化しているかのフラッグ

  Monster(int nameNum, int rareNum) {
    this.name = this.summonMonster(nameNum);
    this.rare = rareNum;

    if(this.rare >= 3){
      this.name = "メタル" + this.name;
      this.evo = 1;
    }else{
      this.evo = 0;
    }

  }

  String summonMonster(int mnumber) {
    String monsters[] = { "スライム", "サハギン", "ドラゴン", "デュラハン", "シーサーペント" };
    return monsters[mnumber];
  }



  @Override
  public String toString() {
    return this.name + ":レア度[" + this.rare + "]\n";
  }
}