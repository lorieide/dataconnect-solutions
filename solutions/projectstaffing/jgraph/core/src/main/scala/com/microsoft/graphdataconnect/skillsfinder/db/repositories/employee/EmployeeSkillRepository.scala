/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.microsoft.graphdataconnect.skillsfinder.db.repositories.employee

import com.microsoft.graphdataconnect.skillsfinder.db.entities.employee.Skill
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
trait EmployeeSkillRepository extends JpaRepository[Skill, Long] {

}
