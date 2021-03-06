/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.flowable.test.delegate;

import java.util.concurrent.atomic.AtomicInteger;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

/**
 * @author Joram Barrez
 */
public class ThrowsExceptionTestJavaDelegate implements JavaDelegate {
    
    public static boolean FAIL;
    public static AtomicInteger COUNT = new AtomicInteger();
    
    @Override
    public void execute(DelegateExecution execution) {
        COUNT.incrementAndGet();
        if (FAIL) {
            throw new RuntimeException();
        }
    }

}
