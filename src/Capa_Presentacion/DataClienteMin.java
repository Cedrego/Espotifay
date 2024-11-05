/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capa_Presentacion;
import java.util.ArrayList;
import java.util.List;

public class DataClienteMin{
    
    private String nickname;
    private String picture;
    private List<DataParticular> DataPart; //coleccion

    public DataClienteMin() {
    }

    public DataClienteMin(String nick,List<DataParticular> DataP,String pic) {
        this.nickname = nick;
        this.DataPart = DataP;
        this.picture= pic;
    }
    public DataClienteMin(String nick) {
        this.nickname = nick;
        this.DataPart = new ArrayList();
        this.picture = null;
    }
    //setters

    public void setDataPart(List<DataParticular> DataPart) {
        this.DataPart = DataPart;
    }

    public String getNickname(){
        return nickname;
    }

    public List<DataParticular> getDataPart() {
        return DataPart;
    }

    public String getPicture() {
        return picture;
    }

    
}