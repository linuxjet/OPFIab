/*
 * Copyright 2012-2014 One Platform Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.onepf.opfiab.model.event;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;

/**
 * Created by rzhilich on 12/3/14.
 */
public class ActivityResultEvent {

    @NonNull
    private final Activity activity;

    private final int requestCode;

    private final int resultCode;

    @NonNull
    private final Intent data;

    public ActivityResultEvent(@NonNull final Activity activity, final int requestCode,
                               final int resultCode,
                               @NonNull final Intent data) {
        this.activity = activity;
        this.requestCode = requestCode;
        this.resultCode = resultCode;
        this.data = data;
    }

    @NonNull
    public Activity getActivity() {
        return activity;
    }

    public int getRequestCode() {
        return requestCode;
    }

    public int getResultCode() {
        return resultCode;
    }

    @NonNull
    public Intent getData() {
        return data;
    }
}
