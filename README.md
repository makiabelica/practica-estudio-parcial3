
[notion pa practica](https://cyberanhg.notion.site/Android-Indicaciones-uu-e81dc9e788e64f9f98ad555717f1f8e3?pvs=4)

----

- **Compatibilidad de pantalla**
    - De forma predeterminada, Android modifica el tamaño del diseño de tu app para ajustarlo a la pantalla actual
    - No modificar el tamaño del componente, es mejor que se extiendan y especifique que posiciones dentra para la vista
    - Las imagenes también son imágenes estirables, tambiém se debe ajustar con los mapas de bits
    - **Android admite mapas de bits de 9-patch (el resto de la imagen permanece sin ajustar)**
    - La densidad de píxeles es la cantidad de píxeles dentro de un área física de la pantalla. Se denomina DPI (puntos por pulgada). Esto es diferente de la resolución de la pantalla, que es la cantidad total de píxeles en una pantalla
    - Se le dice “independencia de la densidad” cuando se perserva el tamaño fisico del diseño de la UI (que el di seño permanece siempre ajustable)
    
    ---
    
     **¿Qué tipo de imágenes se pueden utilizar para evitar crear imágenes separadas para cada densidad en Android?**
    
    - Gráficos vectoriales
    
    **¿Cuál es el propósito principal de los mapas de bits de NinePatch en Android?**
    
    - **Especificar pequeñas regiones de píxeles que se pueden estirar**
    
    **¿Qué unidad de medida se utiliza en Android en lugar de píxeles para lograr independencia de la densidad?.**
    
    - **Píxeles independientes de la densidad (dp o dip)**
    
    ¿Qué función de Android permite que los archivos de diseño alternativos se apliquen en tiempo de ejecución según el tamaño de la pantalla del dispositivo?
    
    - **Diseños alternativos**
    
    Dispositivo que requiere pensar en la experiencia de usuario de la app y se compila de manera especializada es: 
    
    - **Dispositivos Wear OS**
    
- **Configuración**
    - Una pantalla de configuración contiene una *jerarquía* de `Preference`
    - La preferencias se agregan en el archivo  `build.gradle` y de igual manera todas las dependencias
    - `[SwitchPreferenceCompat](https://developer.android.com/reference/androidx/preference/SwitchPreferenceCompat?hl=es-419)` permite a los usuarios activar y desactivar una configuración, y un `Preference` básico sin widgets
    - Cuando se compila una jerarquía, cada `Preference` debe tener una clave única
    - Para tener jerarquia se crea un **`PreferenceFragmentCompat`**
    - Todo se almacena en `SharePreferences`
    
    ---
    
    ¿Qué biblioteca de AndroidX se utiliza para integrar los parámetros de configuración que pueda ajustar el usuario en una app?
    
    - **androidx.preference (no es android.preference)**
    
    ¿Cuál es el componente básico de la biblioteca de Preference de AndroidX?
    
    - **PreferenceFragmentCompat**
    
    ¿Cómo se llama el método que debes anular en un **`PreferenceFragmentCompat`** para proporcionar el recurso XML que deseas aumentar?
    
    - **onCreatePreferences()**
    
    ¿Cuál es el propósito principal de un objeto **`SwitchPreferenceCompat`** en una pantalla de configuración?
    
    - Activar y desactivar una configuración
    
    ¿Qué método se utiliza para registrar un objeto de escucha que se activará cuando cambie una preferencia?
    
    - addOnPreferenceChangeListener()
    
    ¿Qué método se utiliza para leer el valor de una preferencia actualmente almacenada en SharedPreferences?
    
    - **getDefaultSharedPreferences()**
    
    ¿En qué carpeta se debe crear el archivo XML que define la jerarquía de preferencias en una app Android?
    
    - **`res/xml`**
    
    ¿Cuál es el propósito principal de la biblioteca de Preference de AndroidX?
    
    - Administrar la interfaz de usuario e interactuar con el almacenamiento de modo que solo definas las opciones de configuración individuales que el usuario pueda ajustar.
- IU responsiva con ConstraintLayout
    - Se hace con `RelativeLayout` y `ConstraintLayout`(permite crear diseños complejos en una jerarquia de vistas plana, es decir sin grupos anidados)
    - Para definir la posición de una vista en `ConstraintLayout`, agrega al menos una restricción horizontal y una vertical para la vista.
    - Cada restricción define la posición de la vista a lo largo del eje horizontal o vertical
- Android Preferences Activity example
    1. `EditTextPreference` is used to define an editable text property. In this example username is editable property.
    2. `CheckBoxPreference` allows you to define a boolean value in preference screen. In this example we define a property to check weather to send crash report or not.
    3. `ListPreference` as its name suggest allows user to select any one item from a given list. In this example we let user to decide what should be the frequency for data sync.
