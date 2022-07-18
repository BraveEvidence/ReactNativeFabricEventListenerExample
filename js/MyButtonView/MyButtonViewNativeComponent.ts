import type {HostComponent, ViewProps} from 'react-native';
import type {
  DirectEventHandler,
  BubblingEventHandler,
} from 'react-native/Libraries/Types/CodegenTypes';
import codegenNativeComponent from 'react-native/Libraries/Utilities/codegenNativeComponent';

type Event = Readonly<{
  text?: string;
}>;

interface NativeProps extends ViewProps {
  text: string;
  onClickHandler?: DirectEventHandler<Event>; ////Event name should start with on
}

export default codegenNativeComponent<NativeProps>(
  'MyButtonView',
) as HostComponent<NativeProps>;
