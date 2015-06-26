/*
 * Copyright 2012-2015 One Platform Foundation
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
 */

package org.onepf.opfiab.util;

import android.app.Activity;
import android.content.IntentSender;
import android.support.annotation.NonNull;

public abstract class ActivityForResultLauncher {

    private final int requestCode;

    public ActivityForResultLauncher(final int requestCode) {
        this.requestCode = requestCode;
    }

    public abstract void onStartForResult(@NonNull final Activity activity) throws IntentSender.SendIntentException;

    public int getRequestCode() {
        return requestCode;
    }
}
