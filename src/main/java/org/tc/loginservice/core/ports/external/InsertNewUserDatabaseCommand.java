package org.tc.loginservice.core.ports.external;

import org.tc.loginservice.core.domain.UserSnapshot;

public interface InsertNewUserDatabaseCommand {
    Boolean insertUser(UserSnapshot userSnapshot);
}
