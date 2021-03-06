/*******************************************************************************
 * Copyright 2017 General Electric Company
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/

package db.postgres;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ge.predix.acs.service.policy.admin.dao.PolicySetEntity;

public class PolicySetRowMapper implements RowMapper<PolicySetEntity> {

    @Override
    public PolicySetEntity mapRow(final ResultSet rs, final int rowNum) throws SQLException {
        return new PolicySetEntity(null, rs.getString("policy_set_id"), rs.getString("policy_set_json"));
    }

}
