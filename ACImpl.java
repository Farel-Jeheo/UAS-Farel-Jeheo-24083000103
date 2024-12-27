/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ac;

/**
 *
 * @author ASUS
 */
public class ACImpl implements AC {
    private boolean isOn = false;

    @Override
    public void hidupkanAC() {
        isOn = true;
        System.out.println("AC dinyalakan.");
    }

    @Override
    public void matikanAC() {
        isOn = false;
        System.out.println("AC dimatikan.");
    }

    @Override
    public void dinginkanAC() {
        if (isOn) {
            System.out.println("AC sedang mendinginkan ruangan.");
        } else {
            System.out.println("AC tidak dapat mendinginkan. Silakan hidupkan terlebih dahulu.");
        }
    }

    @Override
    public void panaskanAC() {
        if (isOn) {
            System.out.println("AC sedang memanaskan ruangan.");
        } else {
            System.out.println("AC tidak dapat memanaskan. Silakan hidupkan terlebih dahulu.");
        }
    }
}
