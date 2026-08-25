package AT08;

public class Principal{
    public static void main(String[] args) {
        Medico medico = new Medico("Flávio", "Cardiologista", 47821);
        Paciente paciente = new Paciente("Pedro", 78, "984.508.387-85");

        System.out.println();
        medico.apresentarMedico();
        System.out.println();
        paciente.apresentarPaciente();
        System.out.println();
        paciente.realizarConsulta(medico);

    }
}