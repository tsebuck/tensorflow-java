/* Copyright 2018-2022 The TensorFlow Authors. All Rights Reserved.

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

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.tensorflow.GraphOperation;
import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.ndarray.Shape;
import org.tensorflow.op.Operands;
import org.tensorflow.op.RawOp;
import org.tensorflow.op.RawOpInputs;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Endpoint;
import org.tensorflow.op.annotation.OpInputsMetadata;
import org.tensorflow.op.annotation.OpMetadata;
import org.tensorflow.proto.framework.DataType;
import org.tensorflow.types.TInt32;
import org.tensorflow.types.TInt64;
import org.tensorflow.types.family.TType;

/**
 * Gets next element for the provided shard number.
 */
@OpMetadata(
    opType = MultiDeviceIteratorGetNextFromShard.OP_NAME,
    inputsClass = MultiDeviceIteratorGetNextFromShard.Inputs.class
)
public final class MultiDeviceIteratorGetNextFromShard extends RawOp implements Iterable<Operand<TType>> {
  /**
   * The name of this op, as known by TensorFlow core engine
   */
  public static final String OP_NAME = "MultiDeviceIteratorGetNextFromShard";

  private List<Output<?>> components;

  @SuppressWarnings("unchecked")
  public MultiDeviceIteratorGetNextFromShard(Operation operation) {
    super(operation, OP_NAME);
    int outputIdx = 0;
    int componentsLength = operation.outputListLength("components");
    components = Arrays.asList(operation.outputList(outputIdx, componentsLength));
    outputIdx += componentsLength;
  }

  /**
   * Factory method to create a class wrapping a new MultiDeviceIteratorGetNextFromShard operation.
   *
   * @param scope current scope
   * @param multiDeviceIterator A MultiDeviceIterator resource.
   * @param shardNum Integer representing which shard to fetch data for.
   * @param incarnationId Which incarnation of the MultiDeviceIterator is running.
   * @param outputTypes The type list for the return values.
   * @param outputShapes The list of shapes being produced.
   * @return a new instance of MultiDeviceIteratorGetNextFromShard
   */
  @Endpoint(
      describeByClass = true
  )
  public static MultiDeviceIteratorGetNextFromShard create(Scope scope,
      Operand<? extends TType> multiDeviceIterator, Operand<TInt32> shardNum,
      Operand<TInt64> incarnationId, List<Class<? extends TType>> outputTypes,
      List<Shape> outputShapes) {
    OperationBuilder opBuilder = scope.opBuilder(OP_NAME, "MultiDeviceIteratorGetNextFromShard");
    opBuilder.addInput(multiDeviceIterator.asOutput());
    opBuilder.addInput(shardNum.asOutput());
    opBuilder.addInput(incarnationId.asOutput());
    opBuilder.setAttr("output_types", Operands.toDataTypes(outputTypes));
    Shape[] outputShapesArray = new Shape[outputShapes.size()];
    for (int i = 0 ; i < outputShapesArray.length ; i++) {
      outputShapesArray[i] = outputShapes.get(i);
    }
    opBuilder.setAttr("output_shapes", outputShapesArray);
    return new MultiDeviceIteratorGetNextFromShard(opBuilder.build());
  }

  /**
   * Gets components.
   * Result of the get_next on the dataset.
   * @return components.
   */
  public List<Output<?>> components() {
    return components;
  }

  @Override
  @SuppressWarnings({"rawtypes", "unchecked"})
  public Iterator<Operand<TType>> iterator() {
    return (Iterator) components.iterator();
  }

  @OpInputsMetadata(
      outputsClass = MultiDeviceIteratorGetNextFromShard.class
  )
  public static class Inputs extends RawOpInputs<MultiDeviceIteratorGetNextFromShard> {
    /**
     * A MultiDeviceIterator resource.
     */
    public final Operand<? extends TType> multiDeviceIterator;

    /**
     * Integer representing which shard to fetch data for.
     */
    public final Operand<TInt32> shardNum;

    /**
     * Which incarnation of the MultiDeviceIterator is running.
     */
    public final Operand<TInt64> incarnationId;

    /**
     * The type list for the return values.
     */
    public final DataType[] outputTypes;

    /**
     * The list of shapes being produced.
     */
    public final Shape[] outputShapes;

    public Inputs(GraphOperation op) {
      super(new MultiDeviceIteratorGetNextFromShard(op), op, Arrays.asList("output_types", "output_shapes"));
      int inputIndex = 0;
      multiDeviceIterator = (Operand<? extends TType>) op.input(inputIndex++);
      shardNum = (Operand<TInt32>) op.input(inputIndex++);
      incarnationId = (Operand<TInt64>) op.input(inputIndex++);
      outputTypes = op.attributes().getAttrTypeList("output_types");
      outputShapes = op.attributes().getAttrShapeList("output_shapes");
    }
  }
}
