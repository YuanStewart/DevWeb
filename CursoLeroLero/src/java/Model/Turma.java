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
    
    int instrutor_id;
    int cursos_id;
    Date data_inicio;
    Date data_final;
    int carga_horaria;
    int id;
    
    public Turma(){};
    
    public Turma(int instrutor_id, int cursos_id, Date data_inicio, Date data_final, int carga_horaria, int id) {
        this.instrutor_id = instrutor_id;
        this.cursos_id = cursos_id;
        this.data_inicio = data_inicio;
        this.data_final = data_final;
        this.carga_horaria = carga_horaria;
        this.id = id;
    }
    
    
    

    public int getInstrutor_id() {
        return instrutor_id;
    }

    public void setInstrutor_id(int instrutor_id) {
        this.instrutor_id = instrutor_id;
    }

    public int getCursos_id() {
        return cursos_id;
    }

    public void setCursos_id(int cursos_id) {
        this.cursos_id = cursos_id;
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
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
