/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PPP_Project;

public abstract class KamarDecorator implements Kamar { //decorator

    protected Kamar decoratedKamar;

    public KamarDecorator(Kamar decoratedKamar) {
        this.decoratedKamar = decoratedKamar;
    }

    public void description() {
        decoratedKamar.description();
    }
}
