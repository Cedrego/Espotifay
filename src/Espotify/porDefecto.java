/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Espotify;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 *
 * @author cedre
 */
@Entity
public class porDefecto extends Playlist {
    @OneToOne
    private Genero genero;
}
