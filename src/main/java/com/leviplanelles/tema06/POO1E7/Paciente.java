package com.leviplanelles.tema06.POO1E7;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Objects;

public class Paciente {
    public enum Gender {
        MALE, FEMALE
    }
    private final int SIP;
    private final String NAME;
    private final Gender GENDER;
    private final int AGE;
    private LocalDateTime FECHA_HORA_ENTRADA;
    private final String SINTOMATOLOGIA;
    private float[] preRev;
    private boolean atendido;
    private String motivoAlta;
    private LocalDateTime fecha_hora_alta;

    public Paciente(int SIP, String NAME, Gender GENDER, int AGE, String SINTOMATOLOGIA) {
        this.SIP = SIP;
        this.NAME = NAME;
        this.GENDER = GENDER;
        this.AGE = AGE;
        this.FECHA_HORA_ENTRADA = LocalDateTime.now();
        this.SINTOMATOLOGIA = SINTOMATOLOGIA;
        this.preRev = new float[4];
        this.atendido = false;
    }

    public int getSIP() {
        return SIP;
    }

    public String getNAME() {
        return NAME;
    }

    public Gender getGENDER() {
        return GENDER;
    }

    public int getAGE() {
        return AGE;
    }

    public LocalDateTime getFECHA_HORA_ENTRADA() {
        return FECHA_HORA_ENTRADA;
    }

    public String getSINTOMATOLOGIA() {
        return SINTOMATOLOGIA;
    }

    public float[] getPreRev() {
        return preRev;
    }

    public boolean isAtendido() {
        return atendido;
    }

    public void setAtendido(boolean atendido) {
        this.atendido = atendido;
    }

    public void setMotivoAlta(String motivoAlta) {
        this.motivoAlta = motivoAlta;
    }

    public void setFecha_hora_alta(LocalDateTime fecha_hora_alta) {
        this.fecha_hora_alta = fecha_hora_alta;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Paciente paciente = (Paciente) o;
        return SIP == paciente.SIP && AGE == paciente.AGE && Objects.equals(NAME, paciente.NAME) && GENDER == paciente.GENDER && Objects.equals(FECHA_HORA_ENTRADA, paciente.FECHA_HORA_ENTRADA) && Objects.equals(SINTOMATOLOGIA, paciente.SINTOMATOLOGIA) && Objects.deepEquals(preRev, paciente.preRev);
    }

    @Override
    public int hashCode() {
        return Objects.hash(SIP, NAME, GENDER, AGE, FECHA_HORA_ENTRADA, SINTOMATOLOGIA, Arrays.hashCode(preRev));
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String fechaFormateada = FECHA_HORA_ENTRADA.format(formatter);
        String fechaAltaFormateda = fecha_hora_alta == null ? "No hay fecha de alta" : fecha_hora_alta.format(formatter);
        String motivo = motivoAlta == null ? "Paciente todavia no atendido" : motivoAlta;
        return "Paciente {\n" +
                "SIP = " + SIP + "\n" +
                "NAME = " + NAME + "\n" +
                "GENDER = " + GENDER + "\n" +
                "AGE = " + AGE + "\n" +
                "FECHA_HORA_ENTRADA = " + fechaFormateada + "\n" +
                "SINTOMATOLOGIA = " + SINTOMATOLOGIA + "\n" +
                "preRev = " + Arrays.toString(preRev) + "\n" +
                "atendido = " + atendido + "\n" +
                "motivoAlta = " + motivo + "\n" +
                "fechaHoraAlta = " + fechaAltaFormateda + "\n" +
                "}";
    }
}
