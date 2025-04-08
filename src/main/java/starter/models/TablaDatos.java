package starter.models;

import io.cucumber.java.DataTableType;
import java.util.Map;

public class TablaDatos {
    @DataTableType
    public DatosCredenciales datosCredencialesEntry(Map<String, String> entry) {
        return new DatosCredenciales(
                entry.get("usuario"),
                entry.get("password")
        );
    }
}
