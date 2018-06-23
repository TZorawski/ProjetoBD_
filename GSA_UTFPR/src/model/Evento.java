/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author henriko-bcc-utfpr-cm
 */
public class Evento {
    private String sigla;
    private String nome;
    private Date dataInicio;
    private Date dataFim;
    private Curso curso;

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public Curso getCurso() {
        return curso;
    }
            
            
       public String getDataInicioMySQL() {
        DateFormat dateFormat = DateFormat.getDateInstance();
        String temp = dateFormat.format(this.dataInicio);

        String day = temp.substring(0, 2);
        String month = temp.substring(3, 5);
        String year = temp.substring(6, 10);
        return year + '/' + month + '/' + day;
    }

    public String getStrDataInicio() {
        DateFormat dateFormat = DateFormat.getDateInstance();
        String temp = dateFormat.format(this.dataInicio);

        String day = temp.substring(0, 2);
        String month = temp.substring(3, 5);
        String year = temp.substring(6, 10);
        return day + '/' + month + '/' + year;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataInicio(String dataInicio) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        format.setLenient(false);
        this.dataInicio = (Date) format.parse(dataInicio);
    }

    public void setDataInicioMySQL(String dataInicio) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        this.dataInicio = (Date) format.parse(dataInicio);
    }

       public String getDataFimMySQL() {
        DateFormat dateFormat = DateFormat.getDateInstance();
        String temp = dateFormat.format(this.dataFim);

        String day = temp.substring(0, 2);
        String month = temp.substring(3, 5);
        String year = temp.substring(6, 10);
        return year + '/' + month + '/' + day;
    }

    public String getStrDataFim() {
        DateFormat dateFormat = DateFormat.getDateInstance();
        String temp = dateFormat.format(this.dataFim);

        String day = temp.substring(0, 2);
        String month = temp.substring(3, 5);
        String year = temp.substring(6, 10);
        return day + '/' + month + '/' + year;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public void setDataFim(String dataFim) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        format.setLenient(false);
        this.dataFim = (Date) format.parse(dataFim);
    }

    public void setDataFimMySQL(String dataFim) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        this.dataFim = (Date) format.parse(dataFim);
    }
}