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
public class Matricula {
    
    int turmas_id;
    int alunos_id;
    Date data_matricula;
    float nota;
    int id;
    
    public Matricula(){};
    
    public Matricula(int turmas_id, int alunos_id, Date data_matricula, float nota, int id) {
        this.turmas_id = turmas_id;
        this.alunos_id = alunos_id;
        this.data_matricula = data_matricula;
        this.nota = nota;
        this.id = id;
    }
    
    

    public int getTurmas_id() {
        return turmas_id;
    }

    public void setTurmas_id(int turmas_id) {
        this.turmas_id = turmas_id;
    }

    public int getAlunos_id() {
        return alunos_id;
    }

    public void setAlunos_id(int alunos_id) {
        this.alunos_id = alunos_id;
    }

    public Date getData_matricula() {
        return data_matricula;
    }

    public void setData_matricula(Date data_matricula) {
        this.data_matricula = data_matricula;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
