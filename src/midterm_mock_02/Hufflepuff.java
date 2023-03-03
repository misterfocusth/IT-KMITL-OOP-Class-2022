/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm_mock_02;

/**
 *
 * @author misterfocusth
 */
public class Hufflepuff extends Houses implements Magicable {

    public Hufflepuff() {
        super("Hufflepuff", "YELLOW");
    }

    @Override
    public void attackSpell(Player player, Player target, Spell spell) {
        int totalATKDamage = spell.getDamage() + player.getAttackDamage();
        target.setHp(target.getHp() - totalATKDamage);

        if (spell instanceof Incendio) {
            player.setMana(player.getMana() - 3);
        } else {
            player.setMana(player.getMana() - 4);
        }

        System.out.println("[" + player.getName() + "]: use spell (" + spell.getName() + ")");

    }

    @Override
    public void defense(Player player, Player damager) {
        player.setHp(player.getHp() + 4);
        player.setMana(player.getMana() + 3);
        System.out.println(player.getName() + ": Protego!");
    }

}
