package space.axolab.axogram.tgnet.model

import space.axolab.axogram.tgnet.OutputSerializedData

public interface TlGen_Object {
    fun serializeToStream(stream: OutputSerializedData)
}