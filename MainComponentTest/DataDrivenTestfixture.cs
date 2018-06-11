using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using NUnit.Framework;

namespace MainComponentTest
{
    [TestFixture(10)]
    [TestFixture(42)]
    public class DataDrivenTestFixture
    {
        int _x;
        public DataDrivenTestFixture(int x)
        {
            _x = x;
        }
        [Test]
        public void TestArguments()
        {
            Assert.Pass($"X is {_x}");
        }
    }
}
