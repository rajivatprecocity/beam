package org.apache.beam.runners.spark.structuredstreaming.translation.batch;

import org.apache.beam.sdk.transforms.PTransform;
import org.apache.beam.sdk.values.KV;
import org.apache.beam.sdk.values.PCollection;

class CombinePerKeyTranslatorBatch<K, InputT, AccumT, OutputT> implements BatchTransformTranslator<PTransform<PCollection<KV<K, InputT>>, PCollection<KV<K, OutputT>>>> {

  @Override public void translateNode(
      PTransform<PCollection<KV<K, InputT>>, PCollection<KV<K, OutputT>>> transform,
      BatchTranslationContext context) {

  }
}
