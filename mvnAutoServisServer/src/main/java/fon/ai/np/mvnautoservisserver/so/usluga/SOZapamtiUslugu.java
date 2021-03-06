/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fon.ai.np.mvnautoservisserver.so.usluga;

import fon.ai.np.mvnautoserviscommonlib.domen.Usluga;
import fon.ai.np.mvnautoserviscommonlib.exception.ValidationException;
import fon.ai.np.mvnautoservisserver.so.OpstaSO;
import fon.ai.np.mvnautoservisserver.validator.impl.UslugaValidator;
import java.sql.SQLException;

/**
 *
 * @author Nikola
 */
public class SOZapamtiUslugu extends OpstaSO {

    public SOZapamtiUslugu(Usluga usluga) {
        super();
        odo = usluga;
        validator = new UslugaValidator();
    }

    @Override
    protected void proveriPreduslov() throws ValidationException {
        validator.validate(odo);
    }

    @Override
    protected void izvrsiOperaciju() throws SQLException {
        odo = db.zapamti(odo);
    }

}
