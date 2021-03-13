package challenge;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento {

    public List<Carro> carrosList = new ArrayList<>();


    public void estacionar(Carro carro) throws EstacionamentoException {
        if (motoristaExiste(carro) && carrosList.size() < 10) {
            carrosList.add(carro);
        } else if (carrosList.size() == 10) {
            if (carrosList.stream().allMatch(carro1 -> carro1.getMotorista().getIdade() > 55)) {
                throw new EstacionamentoException("Não há vagas!");
            } else {
                for (int index = 0; index < 10; index += 1) {
                    if (carrosList.get(index).getMotorista().getIdade() < 55) {
                        carrosList.remove(carro);
                    }
                }
            }
        }

    }

    public int carrosEstacionados() {
        return carrosList.size();
    }

    public boolean carroEstacionado(Carro carro) {
        return carrosList.contains(carro);
    }

    public boolean motoristaExiste(Carro carro) throws EstacionamentoException {
        if (carro.getMotorista().getIdade() < 18) {
            throw new EstacionamentoException("O motorista é menor de 18 anos, não permitido estacionar!");
        } else if (carro.getMotorista().getPontos() > 20) {
            throw new EstacionamentoException("O motorista está com a habilitação suspensa!");
        }
        return true;
    }
}
