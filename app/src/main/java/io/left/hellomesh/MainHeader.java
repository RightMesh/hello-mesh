package io.left.hellomesh;
import java.util.Random;
import io.left.rightmesh.id.MeshID;

/**
 * Created by sallyp on 2018-01-13.
 */

public class MainHeader {

    String name;
    MeshID uuid;


    public MainHeader(String name, MeshID uuid) {
        this.name = name;
        this.uuid = uuid;
    }

    public String generateRandomName() {
        Random rand = new Random();

        int n = rand.nextInt(50) + 1;
        String intg = Integer.toString(n);
        String user = "user" + intg;
        return user;
    }

    public String getName() {
        return this.name;
    }

    public MeshID getUuid() {
        return this.uuid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUuid(MeshID uuid) {
        this.uuid = uuid;
    }


}
