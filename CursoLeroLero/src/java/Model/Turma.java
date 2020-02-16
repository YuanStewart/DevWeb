/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author yuan
 */
public class Turma {
    
    int instruto_id;
    int curosos_id;
    Date data_inicio;
    Date data_final;
    int carga_horaria;
    
    public Turma(){};
    
    public Turma(int instruto_id, int curosos_id, Date data_inicio, Date data_final, int carga_horaria) {
        this.instruto_id = instruto_id;
        this.curosos_id = curosos_id;
        this.data_inicio = data_inicio;
        this.data_final = data_final;
        this.carga_horaria = carga_horaria;
    }
    
    
    

    public int getInstruto_id() {
        return instruto_id;
    }

    public void setInstruto_id(int instruto_id) {
        this.instruto_id = instruto_id;
    }

    public int getCurosos_id() {
        return curosos_id;
    }

    public void setCurosos_id(int curosos_id) {
        this.curosos_id = curosos_id;
    }

    public Date getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(Date data_inicio) {
        this.data_inicio = data_inicio;
    }

    public Date getData_final() {
        return data_final;
    }

    public void setData_final(Date data_final) {
        this.data_final = data_final;
    }

    public int getCarga_horaria() {
        return carga_horaria;
    }

    public void setCarga_horaria(int carga_horaria) {
        this.carga_horaria = carga_horaria;
    }
    
    
}
