package ru.galeev.service.impl;

import lombok.Data;
import org.springframework.stereotype.Service;
import ru.galeev.dao.AppUserDAO;
import ru.galeev.service.UserActivationService;
import ru.galeev.utils.CryptoTool;
@Data
@Service
public class UserActivationServiceImpl implements UserActivationService {
    private final AppUserDAO appUserDAO;
    private final CryptoTool cryptoTool;

    @Override
    public boolean activation(String cryptoUserId) {
        var userId = cryptoTool.idOf(cryptoUserId);
        var optional = appUserDAO.findById(userId);
        if (optional.isPresent()) {
            var user = optional.get();
            user.setIsActive(true);
            appUserDAO.save(user);
            return true;
        }
        return false;
    }
}
