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

package org.tensorflow.op.data;

import java.util.List;
import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.ndarray.Shape;
import org.tensorflow.op.Operands;
import org.tensorflow.op.RawOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Endpoint;
import org.tensorflow.op.annotation.Operator;
import org.tensorflow.types.TInt64;
import org.tensorflow.types.family.TType;

/**
 * Creates a dataset that asynchronously prefetches elements from `input_dataset`.
 */
public final class PrefetchDataset extends RawOp implements Operand<TType> {
  
  /**
   * Optional attributes for {@link org.tensorflow.op.data.PrefetchDataset}
   */
  public static class Options {
    
    /**
     * @param slackPeriod 
     */
    public Options slackPeriod(Long slackPeriod) {
      this.slackPeriod = slackPeriod;
      return this;
    }
    
    /**
     * @param legacyAutotune 
     */
    public Options legacyAutotune(Boolean legacyAutotune) {
      this.legacyAutotune = legacyAutotune;
      return this;
    }
    
    /**
     * @param bufferSizeMin 
     */
    public Options bufferSizeMin(Long bufferSizeMin) {
      this.bufferSizeMin = bufferSizeMin;
      return this;
    }
    
    private Long slackPeriod;
    private Boolean legacyAutotune;
    private Long bufferSizeMin;
    
    private Options() {
    }
  }
  
  /**
   * Factory method to create a class wrapping a new PrefetchDataset operation.
   * 
   * @param scope current scope
   * @param inputDataset 
   * @param bufferSize The maximum number of elements to buffer in an iterator over
   * this dataset.
   * @param outputTypes 
   * @param outputShapes 
   * @param options carries optional attributes values
   * @return a new instance of PrefetchDataset
   */
  @Endpoint(describeByClass = true)
  public static PrefetchDataset create(Scope scope, Operand<?> inputDataset, Operand<TInt64> bufferSize, List<Class<? extends TType>> outputTypes, List<Shape> outputShapes, Options... options) {
    OperationBuilder opBuilder = scope.env().opBuilder("PrefetchDataset", scope.makeOpName("PrefetchDataset"));
    opBuilder.addInput(inputDataset.asOutput());
    opBuilder.addInput(bufferSize.asOutput());
    opBuilder = scope.apply(opBuilder);
    opBuilder.setAttr("output_types", Operands.toDataTypes(outputTypes));
    Shape[] outputShapesArray = new Shape[outputShapes.size()];
    for (int i = 0; i < outputShapesArray.length; ++i) {
      outputShapesArray[i] = outputShapes.get(i);
    }
    opBuilder.setAttr("output_shapes", outputShapesArray);
    if (options != null) {
      for (Options opts : options) {
        if (opts.slackPeriod != null) {
          opBuilder.setAttr("slack_period", opts.slackPeriod);
        }
        if (opts.legacyAutotune != null) {
          opBuilder.setAttr("legacy_autotune", opts.legacyAutotune);
        }
        if (opts.bufferSizeMin != null) {
          opBuilder.setAttr("buffer_size_min", opts.bufferSizeMin);
        }
      }
    }
    return new PrefetchDataset(opBuilder.build());
  }
  
  /**
   * @param slackPeriod 
   */
  public static Options slackPeriod(Long slackPeriod) {
    return new Options().slackPeriod(slackPeriod);
  }
  
  /**
   * @param legacyAutotune 
   */
  public static Options legacyAutotune(Boolean legacyAutotune) {
    return new Options().legacyAutotune(legacyAutotune);
  }
  
  /**
   * @param bufferSizeMin 
   */
  public static Options bufferSizeMin(Long bufferSizeMin) {
    return new Options().bufferSizeMin(bufferSizeMin);
  }
  
  /**
   */
  public Output<?> handle() {
    return handle;
  }
  
  @Override
  @SuppressWarnings("unchecked")
  public Output<TType> asOutput() {
    return (Output<TType>) handle;
  }
  
  /** The name of this op, as known by TensorFlow core engine */
  public static final String OP_NAME = "PrefetchDataset";
  
  private Output<?> handle;
  
  private PrefetchDataset(Operation operation) {
    super(operation);
    int outputIdx = 0;
    handle = operation.output(outputIdx++);
  }
}
