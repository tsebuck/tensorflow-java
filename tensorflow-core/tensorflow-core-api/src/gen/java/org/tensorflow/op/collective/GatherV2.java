/* Copyright 2018 The TensorFlow Authors. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
=======================================================================*/

// This class has been generated, DO NOT EDIT!

package org.tensorflow.op.collective;

import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.RawOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Endpoint;
import org.tensorflow.op.annotation.Operator;
import org.tensorflow.types.TInt32;
import org.tensorflow.types.family.TNumber;

/**
 * Mutually accumulates multiple tensors of identical type and shape.
 * 
 * @param <T> data type for {@code data()} output
 */
public final class GatherV2<T extends TNumber> extends RawOp implements Operand<T> {
  
  /**
   * Optional attributes for {@link org.tensorflow.op.collective.GatherV2}
   */
  public static class Options {
    
    /**
     * @param communicationHint 
     */
    public Options communicationHint(String communicationHint) {
      this.communicationHint = communicationHint;
      return this;
    }
    
    /**
     * @param timeoutSeconds 
     */
    public Options timeoutSeconds(Float timeoutSeconds) {
      this.timeoutSeconds = timeoutSeconds;
      return this;
    }
    
    private String communicationHint;
    private Float timeoutSeconds;
    
    private Options() {
    }
  }
  
  /**
   * Factory method to create a class wrapping a new GatherV2 operation.
   * 
   * @param scope current scope
   * @param input 
   * @param groupSize 
   * @param groupKey 
   * @param instanceKey 
   * @param options carries optional attributes values
   * @return a new instance of GatherV2
   */
  @Endpoint(describeByClass = true)
  public static <T extends TNumber> GatherV2<T> create(Scope scope, Operand<T> input, Operand<TInt32> groupSize, Operand<TInt32> groupKey, Operand<TInt32> instanceKey, Options... options) {
    OperationBuilder opBuilder = scope.env().opBuilder("CollectiveGatherV2", scope.makeOpName("GatherV2"));
    opBuilder.addInput(input.asOutput());
    opBuilder.addInput(groupSize.asOutput());
    opBuilder.addInput(groupKey.asOutput());
    opBuilder.addInput(instanceKey.asOutput());
    opBuilder = scope.apply(opBuilder);
    if (options != null) {
      for (Options opts : options) {
        if (opts.communicationHint != null) {
          opBuilder.setAttr("communication_hint", opts.communicationHint);
        }
        if (opts.timeoutSeconds != null) {
          opBuilder.setAttr("timeout_seconds", opts.timeoutSeconds);
        }
      }
    }
    return new GatherV2<T>(opBuilder.build());
  }
  
  /**
   * @param communicationHint 
   */
  public static Options communicationHint(String communicationHint) {
    return new Options().communicationHint(communicationHint);
  }
  
  /**
   * @param timeoutSeconds 
   */
  public static Options timeoutSeconds(Float timeoutSeconds) {
    return new Options().timeoutSeconds(timeoutSeconds);
  }
  
  /**
   */
  public Output<T> data() {
    return data;
  }
  
  @Override
  public Output<T> asOutput() {
    return data;
  }
  
  /** The name of this op, as known by TensorFlow core engine */
  public static final String OP_NAME = "CollectiveGatherV2";
  
  private Output<T> data;
  
  private GatherV2(Operation operation) {
    super(operation);
    int outputIdx = 0;
    data = operation.output(outputIdx++);
  }
}
