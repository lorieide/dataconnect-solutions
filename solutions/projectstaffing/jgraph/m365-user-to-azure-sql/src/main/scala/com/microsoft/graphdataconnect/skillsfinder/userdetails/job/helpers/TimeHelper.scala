/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.microsoft.graphdataconnect.skillsfinder.userdetails.job.helpers

import java.time.Instant

trait TimeHelper {

  def nowUTC(): Long = {
    Instant.now().getEpochSecond
  }

}
