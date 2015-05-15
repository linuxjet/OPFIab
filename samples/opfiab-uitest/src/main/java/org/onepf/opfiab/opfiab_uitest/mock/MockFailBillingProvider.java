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

package org.onepf.opfiab.opfiab_uitest.mock;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import org.onepf.opfiab.OPFIab;
import org.onepf.opfiab.model.BillingProviderInfo;
import org.onepf.opfiab.model.event.RequestHandledEvent;
import org.onepf.opfiab.model.event.billing.BillingRequest;
import org.onepf.opfiab.util.OPFIabUtils;

import static org.onepf.opfiab.model.event.billing.Status.BILLING_UNAVAILABLE;

/**
 * @author antonpp
 * @since 14.05.15
 */
public class MockFailBillingProvider extends MockBillingProvider {

    protected static final String NAME = MockFailBillingProvider.class.getSimpleName();

    public static final BillingProviderInfo INFO =
            new BillingProviderInfo(NAME, null);

    @NonNull
    @Override
    public BillingProviderInfo getInfo() {
        return INFO;
    }

    @Override
    public void checkManifest() {
        // nothing
    }

    @Override
    public boolean isAvailable() {
        return false;
    }

    @Override
    public boolean isAuthorised() {
        return false;
    }

    @Override
    public void onEventAsync(@NonNull BillingRequest billingRequest) {
        OPFIab.post(new RequestHandledEvent(billingRequest));
        OPFIab.post(OPFIabUtils.emptyResponse(getInfo(), billingRequest, BILLING_UNAVAILABLE));
    }

    @Nullable
    @Override
    public Intent getStorePageIntent() {
        return null;
    }

    @Nullable
    @Override
    public Intent getRateIntent() {
        return null;
    }
}
