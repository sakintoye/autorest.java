﻿namespace AutoRest.Java.DanModel
{
    public class JavaEnumValue
    {
        public JavaEnumValue(string name, string value)
        {
            Name = name;
            Value = value;
        }

        public string Name { get; }

        public string Value { get; }
    }
}
