/*
 * Copyright 2013-18 Skynav, Inc. All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY SKYNAV, INC. AND ITS CONTRIBUTORS “AS IS” AND ANY
 * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL SKYNAV, INC. OR ITS CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
 
package com.skynav.ttpe.w3c.ttml2.presentation.valid;

import org.junit.Ignore;
import org.junit.Test;

import com.skynav.ttpe.app.PresenterTestDriver;

public class TTML2PresenterTestCases extends PresenterTestDriver {

    @Test
    public void testTTML2IMSC11Ruby1() throws Exception {
        performPresentationTest("ttml2-prstn-imsc11-ruby-1.xml", 0, 0);
    }

    @Test
    public void testTTML2IMSC11Ruby2() throws Exception {
        performPresentationTest("ttml2-prstn-imsc11-ruby-2.xml", 0, 0);
    }

    @Test
    public void testTTML2IMSC11Ruby3() throws Exception {
        performPresentationTest("ttml2-prstn-imsc11-ruby-3.xml", 0, 0);
    }

    @Test
    public void testTTML2IMSC11Ruby4() throws Exception {
        performPresentationTest("ttml2-prstn-imsc11-ruby-4.xml", 0, 0);
    }

    @Test
    public void testTTML2IMSC11Ruby5() throws Exception {
        performPresentationTest("ttml2-prstn-imsc11-ruby-5.xml", 0, 0);
    }

}