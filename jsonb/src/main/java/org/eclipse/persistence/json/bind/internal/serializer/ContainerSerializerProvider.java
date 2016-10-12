package org.eclipse.persistence.json.bind.internal.serializer;

import org.eclipse.persistence.json.bind.internal.unmarshaller.CurrentItem;
import org.eclipse.persistence.json.bind.model.ClassModel;
import org.eclipse.persistence.json.bind.model.JsonBindingModel;

import javax.json.bind.serializer.JsonbSerializer;
import java.lang.reflect.Type;

/**
 * Provides container serializer instance.
 *
 * @author Roman Grigoriadi
 */
public interface ContainerSerializerProvider {

    JsonbSerializer<?> provideSerializer(CurrentItem<?> wrapper, Type runtimeType, ClassModel classModel, JsonBindingModel wrapperModel);
}
