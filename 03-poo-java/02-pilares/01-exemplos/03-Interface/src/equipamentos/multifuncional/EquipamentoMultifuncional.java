package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Impressora, Copiadora, Digitalizadora{
    public void copiar(){
        System.out.println("Copiando via equipamento multifuncional");
    }
    public void digitalizar(){
        System.out.println("Digitalizando via equipamento multifuncional");
    }
    public void imprimir(){
        System.out.println("Imprimindo via equipamento multifuncional");
    }
}
