package unq.dapp.viandaslagauchita.models.user;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import unq.dapp.viandaslagauchita.models.viand.Buy;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Data
public class Client extends Role {

    private List<Buy> buys;

    @Builder
    public Client() {
        super("Client");
        this.buys = new ArrayList();
    }

    public boolean canBuy() {
        return true;
    }

    public void makeBuy(Buy buy){
        buys.add(buy);
    }
}
